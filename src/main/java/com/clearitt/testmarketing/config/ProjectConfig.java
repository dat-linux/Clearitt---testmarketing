package com.clearitt.testmarketing.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Main project @Configuration annotated class.
 * 
 * @author  Louis Malenica
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.clearitt.xero")
public class ProjectConfig {

}
