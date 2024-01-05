package com.clearitt.testmarketing.dto;

/**
 * A simple DTO for holding error data, typically for use by advice classes and potentially
 * returning to the view as a model attribute.
 * 
 * @author  Louis Malenica
 */
public class ErrorDetails {
    
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
