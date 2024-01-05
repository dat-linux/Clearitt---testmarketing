package com.clearitt.testmarketing.controller.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.clearitt.testmarketing.dto.ErrorDetails;
import com.clearitt.testmarketing.service.exceptions.AuthProviderException;

/**
 * Aspect providing exception handling, typically for controllers that interact with provider
 * APIs that throw a com.clearitt.testmarketing.service.xero.exceptionsAuthProviderException.
 * 
 * @author  Louis Malenica
 */
@RestControllerAdvice
public class ControllerExceptionAdvice {

    @ExceptionHandler(AuthProviderException.class)
    public ResponseEntity<ErrorDetails> exceptionAuthHandler() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("There was a problem with accessing this remote service.");
        return ResponseEntity.badRequest()
                             .body(errorDetails);
    }

}