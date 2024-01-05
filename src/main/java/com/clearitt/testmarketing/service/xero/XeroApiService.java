package com.clearitt.testmarketing.service.xero;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import com.xero.api.*;
import com.xero.api.client.AccountingApi;
import com.xero.models.accounting.*;
import com.clearitt.testmarketing.config.xero.XeroProperties;
import com.clearitt.testmarketing.config.xero.XeroTokenKey;
import com.clearitt.testmarketing.dto.xero.XeroAuthSubject;
import com.clearitt.testmarketing.service.exceptions.AuthProviderException;

/**
 * Service class for calling remote Xero APIs.
 * 
 * @author  Louis Malenica
 * @TODO 	Needs CSRF prevention.
 */
@Service
@SessionScope
@EnableConfigurationProperties(XeroProperties.class)
public class XeroApiService {

	@Value("${xero.token-server-url}")
	String xeroTokenServerUrl;
	@Value("${xero.client-id}")
	String xeroClientId;
	@Value("${xero.client-secret}")
	String xeroClientSecret;

    public Contacts findAllContacts(XeroAuthSubject authSubject) {
        String accessToken = authSubject.token(XeroTokenKey.ACCESS_TOKEN);
		String refreshToken = authSubject.token(XeroTokenKey.REFRESH_TOKEN);
		String xeroTenantId = authSubject.token(XeroTokenKey.XERO_TENANT_ID);	
		try {
			accessToken = authSubject.checkToken(accessToken, 
											     refreshToken, 
											     xeroTokenServerUrl, 
											     xeroClientId, 
											     xeroClientSecret);
		} catch (IOException e) {
			throw new AuthProviderException(e.getMessage());
		}
		ApiClient defaultClient = new ApiClient();
		AccountingApi accountingApi = AccountingApi.getInstance(defaultClient);
        Contacts contacts = null;
        try {
            contacts = accountingApi.getContacts(accessToken, 
												 xeroTenantId, 
												 null, null, null, null, null, null, null, null);
            System.out.println("How many contacts did we find: " + contacts.getContacts().size());
        } catch (IOException e) {
            throw new AuthProviderException(e.getMessage());
        }
        return contacts;
    }

}
