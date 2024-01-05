package com.clearitt.testmarketing.dto;

import java.util.HashMap;

/**
 *
 * @author  Louis Malenica
 */
public abstract class AuthSubject<T> {

    protected HashMap<T, String> tokens = null;
    protected HashMap<String, String> claims = null;

    public abstract String token(T key);
    public abstract HashMap<T, String> tokens();
    public abstract HashMap<String, String> claims();
    public abstract void setClaims(HashMap<String, String> claims);
    public abstract boolean isLoggedIn();

}
