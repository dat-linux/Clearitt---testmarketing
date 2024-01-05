package com.clearitt.testmarketing.service.exceptions;

/**
 * To be thrown by provider services and "caught" by their calling controllers.
 * 
 * @author  Louis Malenica
 * @see     com.clearitt.testmarketing.controller.advice.ControllerExceptionAdvice
 */
public class AuthProviderException extends RuntimeException {

    public AuthProviderException(String message) {
        super(message);
    }
    
}
