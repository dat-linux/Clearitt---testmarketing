package com.clearitt.testmarketing.config.xero;

import java.util.ArrayList;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Mapping of xero.* properties that are set in the application.properties config 
 * file.
 * 
 * @author  Louis Malenica
 */
@ConfigurationProperties(prefix = "xero")
public record XeroProperties(String xeroClientId,
                             String xeroClientSecret,
                             String xeroRedirectUri,
                             String xeroRedirectAccess,
                             String xeroTokenServerUrl,
                             String xeroAuthServerUrl,
                             String xeroApiUrl,
                             ArrayList<String> scopes) {}
