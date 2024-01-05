package com.clearitt.testmarketing.dto.xero;

import java.io.IOException;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.clearitt.testmarketing.config.xero.XeroProperties;
import com.clearitt.testmarketing.config.xero.XeroTokenKey;
import com.clearitt.testmarketing.dto.AuthSubject;
import com.google.api.client.auth.oauth2.RefreshTokenRequest;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.http.BasicAuthentication;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.gson.GsonFactory;

/**
 * 
 * 
 * @author  Louis Malenica
 */
@Component
@SessionScope
@EnableConfigurationProperties(XeroProperties.class)
public class XeroAuthSubject extends AuthSubject<XeroTokenKey> {

    @Value("${xero.token-server-url}") 
	String xeroTokenServerUrl;
	@Value("${xero.client-id}") 
	String xeroClientId;
	@Value("${xero.client-secret}") 
	String xeroClientSecret;

    public XeroAuthSubject() {
        tokens = new HashMap<XeroTokenKey, String>();
        claims = new HashMap<String, String>();
    }

    @Override
    public String token(XeroTokenKey key) {
        return tokens.get(key);
    }

    @Override
    public HashMap<XeroTokenKey, String> tokens() {
        return tokens;
    }

    @Override
    public HashMap<String, String> claims() {
        return claims;
    }

    @Override
    public void setClaims(HashMap<String, String> claims) {
        this.claims = claims;
    }

    @Override
    public boolean isLoggedIn() {
        return confirmToken();
    }

    public String checkToken(String accessToken, 
                             String refreshToken, 
                             String xeroTokenServerUrl,
                             String xeroClientId,
                             String xeroClientSecret) throws IOException {
        String token = accessToken;
        DecodedJWT jwt = JWT.decode(token);
        if (jwt.getExpiresAt().getTime() > System.currentTimeMillis()) {
            return token;
        }
		TokenResponse tokenResponse = 
			new RefreshTokenRequest(new NetHttpTransport(), 
									new GsonFactory(),
									new GenericUrl(xeroTokenServerUrl), 
									refreshToken)
			.setClientAuthentication(new BasicAuthentication(xeroClientId, xeroClientSecret))
			.execute();
		token = tokenResponse.getAccessToken();
		updateSubjectCredentials(tokenResponse);
		return token;
	}

    private void updateSubjectCredentials(TokenResponse tokenResponse) throws IOException {
        this.tokens().put(XeroTokenKey.JWT_TOKEN, tokenResponse.toPrettyString());
        this.tokens().put(XeroTokenKey.ACCESS_TOKEN, tokenResponse.getAccessToken());
        this.tokens().put(XeroTokenKey.REFRESH_TOKEN, tokenResponse.getRefreshToken());
        this.tokens().put(XeroTokenKey.EXPIRES_IN_SECONDS, tokenResponse.getExpiresInSeconds().toString());
    }

    private boolean confirmToken() {
        try {
            String accessToken = token(XeroTokenKey.ACCESS_TOKEN);
		    String refreshToken = token(XeroTokenKey.REFRESH_TOKEN);
			accessToken = checkToken(accessToken, 
                                     refreshToken, 
                                     xeroTokenServerUrl, 
                                     xeroClientId, 
                                     xeroClientSecret);
		} catch (IOException e) {
			return false;
		}
        return true;
    }

}
