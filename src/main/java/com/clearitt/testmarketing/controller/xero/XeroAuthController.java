package com.clearitt.testmarketing.controller.xero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.clearitt.testmarketing.config.xero.XeroProperties;
import com.clearitt.testmarketing.dto.xero.XeroAuthSubject;
import com.clearitt.testmarketing.service.xero.XeroAuthService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Controller for the Xero authorisation and callback routines. 
 * 
 * @author Louis Malenica
 * @see    com.clearitt.testmarketing.controller.advice.ControllerExceptionAdvice
 */
@Controller
@RequestMapping("/auth")
@EnableConfigurationProperties(XeroProperties.class)
public class XeroAuthController {

    @Autowired
	XeroAuthService xeroAuthService;

    @GetMapping("/xero")
    public void xero(HttpServletResponse response, 
                     HttpServletRequest request) {
        xeroAuthService.authorize(response, request);
    }

    /**
     * 
     * @param response
     * @param request
     * @param authSubject   Wired XeroAuthSubject object, populated in the authorisation() step
     */
    @GetMapping("/xero/callback")
    public void xeroCallback(HttpServletResponse response, 
                             HttpServletRequest request,
                             @Autowired XeroAuthSubject authSubject) {
        xeroAuthService.callback(response, request, authSubject);
    }

}
