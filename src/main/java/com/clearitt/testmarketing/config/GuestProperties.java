package com.clearitt.testmarketing.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Mapping of guest.* related properties that are set in the application.properties config 
 * file.
 * 
 * @author  Louis Malenica
 */
@ConfigurationProperties(prefix = "guest")
public record GuestProperties(String welcomeMessage,
                              String welcomeMessage2) {}
