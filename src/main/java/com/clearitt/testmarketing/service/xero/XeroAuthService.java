package com.clearitt.testmarketing.service.xero;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.clearitt.testmarketing.config.xero.XeroProperties;
import com.clearitt.testmarketing.config.xero.XeroTokenKey;
import com.clearitt.testmarketing.dto.xero.XeroAuthSubject;
import com.clearitt.testmarketing.service.exceptions.AuthProviderException;
import com.google.api.client.auth.oauth2.AuthorizationCodeFlow;
import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.ClientParametersAuthentication;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.gson.GsonFactory;
import com.google.api.client.util.store.DataStoreFactory;
import com.google.api.client.util.store.MemoryDataStoreFactory;
import com.xero.api.ApiClient;
import com.xero.api.client.IdentityApi;
import com.xero.models.identity.Connection;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Service for calling Xero oauth login routines and callbacks.
 * 
 * @author  Louis Malenica
 * @TODO 	Needs CSRF prevention.
 */
@Service
@SessionScope
@EnableConfigurationProperties(XeroProperties.class)
public class XeroAuthService {

    @Value("${xero.client-id}") 
    String xeroClientId;
    @Value("${xero.client-secret}") 
    String xeroClientSecret;
    @Value("${xero.redirect-uri}") 
    String xeroRedirectUri;
    @Value("${xero.redirect-access}") 
    String xeroRedirectAccess;
    @Value("${xero.token-server-url}") 
    String xeroTokenServerUrl;
    @Value("${xero.auth-server-url}") 
    String xeroAuthServerUrl;
    @Value("${xero.api-url}") 
    String xeroApiUrl;
    @Value("${xero.scopes}") 
    ArrayList<String> scopes;

    private static final String SECRET_STATE = "secret" + new Random().nextInt(999_999);
    private static final NetHttpTransport HTTP_TRANSPORT = new NetHttpTransport();
    private static final JsonFactory JSON_FACTORY = new GsonFactory();
    private static final DataStoreFactory DATA_STORE_FACTORY = new MemoryDataStoreFactory();

    private XeroAuthSubject authSubject;

    public void authorize(HttpServletResponse response, 
                          HttpServletRequest request) throws AuthProviderException {
        request.getSession().setAttribute("state", SECRET_STATE);
        AuthorizationCodeFlow flow;
        try {
            flow = buildAuthFlow();
            String url = buildAuthUrl(flow);
            response.sendRedirect(url);
        } catch (IOException e) {
            throw new AuthProviderException(e.getMessage());
        }
    }
    
    public void callback(HttpServletResponse response, 
                         HttpServletRequest request,
                         XeroAuthSubject xas) throws AuthProviderException {
        this.authSubject = xas;
        String state = (String)request.getSession().getAttribute("state");
        if (SECRET_STATE.equals(state)) {
            String code = (String)request.getParameter("code");
            request.getSession().setAttribute("code", code);
            AuthorizationCodeFlow flow;
            try {
                flow = buildAuthFlow();
                TokenResponse tokenResponse;
                tokenResponse = flow.newTokenRequest(code)
                                    .setRedirectUri(xeroRedirectUri)
                                    .execute();
                ApiClient defaultIdentityClient = new ApiClient(xeroApiUrl, null, null, null, null);
                IdentityApi idApi = new IdentityApi(defaultIdentityClient);
                List<Connection> connection = idApi.getConnections(tokenResponse.getAccessToken(), null);
                addSubjectTokens(tokenResponse, connection, authSubject.tokens());
                addSubjectClaims(authSubject.claims());
                request.getSession().setAttribute("AuthSubject", authSubject);
                response.sendRedirect(xeroRedirectAccess);
            } catch (IOException e) {
                throw new AuthProviderException(e.getMessage());
            }
        }

    }

    private AuthorizationCodeFlow buildAuthFlow() throws IOException {
        return new AuthorizationCodeFlow.Builder(
            BearerToken.authorizationHeaderAccessMethod(),
            HTTP_TRANSPORT,
            JSON_FACTORY,
            new GenericUrl(xeroTokenServerUrl),
            new ClientParametersAuthentication(xeroClientId, 
                                               xeroClientSecret),
            xeroClientId,
            xeroAuthServerUrl)
        .setScopes(scopes)
        .setDataStoreFactory(DATA_STORE_FACTORY)
        .build();
    }

    private String buildAuthUrl(AuthorizationCodeFlow flow) {
        return flow.newAuthorizationUrl()
                   .setClientId(xeroClientId)
                   .setScopes(scopes)
                   .setState(SECRET_STATE)
                   .setRedirectUri(xeroRedirectUri)
                   .build();
    }

    private void addSubjectTokens(TokenResponse tokenResponse,
                                  List<Connection> connection, 
                                  HashMap<XeroTokenKey, String> tokens) throws IOException {
        tokens.put(XeroTokenKey.TOKEN_TYPE, tokenResponse.get(XeroTokenKey.TOKEN_TYPE.name).toString());
        tokens.put(XeroTokenKey.ID_TOKEN, tokenResponse.get(XeroTokenKey.ID_TOKEN.name).toString());
        tokens.put(XeroTokenKey.SCOPE, tokenResponse.getScope());
        tokens.put(XeroTokenKey.XERO_TENANT_ID, connection.get(0).getTenantId().toString());
		tokens.put(XeroTokenKey.JWT_TOKEN, tokenResponse.toPrettyString());
		tokens.put(XeroTokenKey.ACCESS_TOKEN, tokenResponse.getAccessToken());
		tokens.put(XeroTokenKey.REFRESH_TOKEN, tokenResponse.getRefreshToken());
		tokens.put(XeroTokenKey.EXPIRES_IN_SECONDS, tokenResponse.getExpiresInSeconds().toString());
    }

    // @TODO log these to a tracking DB (create a suitable Entity object)
    private void addSubjectClaims(HashMap<String, String> claims) {
        try {
            DecodedJWT jwtDecoded = JWT.decode(authSubject.token(XeroTokenKey.ID_TOKEN));
            System.out.println("+++++++++++++++CLAIMS: ");
            for (Map.Entry<String, Claim> entry : jwtDecoded.getClaims().entrySet())  {
                System.out.println("Key = " + entry.getKey() + 
                                   ", Value = " + entry.getValue().asString()); 
                claims.put(entry.getKey(), entry.getValue().asString());
            }
            System.out.println("---------------CLAIMS ");
        } finally {
            // Log on error, not fatal..
        }
    }

    public void setXeroAuthSubject(XeroAuthSubject authSubject) {
        this.authSubject = authSubject;
    }

}
