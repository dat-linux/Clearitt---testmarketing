package com.clearitt.testmarketing.config.xero;

/**
 * Enum abstracting common keys used to access tokens/values for Xero.
 * 
 * @author  Louis Malenica
 * @see     com.clearitt.testmarketing.dto.xero.XeroAuthSubject
 */
public enum XeroTokenKey {

    TOKEN_TYPE("token_type"), 
    ID_TOKEN("id_token"), 
    SCOPE("scope"), 
    XERO_TENANT_ID("xero_tenant_id"), 
    JWT_TOKEN("jwt_token"), 
    ACCESS_TOKEN("access_token"), 
    REFRESH_TOKEN("refresh_toekn"), 
    EXPIRES_IN_SECONDS("expires_in_seconds");

    public String name;

    XeroTokenKey(String name) {
        this.name = name;
    }        

}
