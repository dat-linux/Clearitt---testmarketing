package com.clearitt.testmarketing.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.clearitt.testmarketing.config.GuestProperties;

import jakarta.servlet.http.HttpSession;

/**
 * Controller to globally handle the logout action.
 * 
 * @author  Louis Malenica
 */
@Controller
@EnableConfigurationProperties(GuestProperties.class)
public class LogoutController {
    
    @Value("${guest.welcome-message}")
    private String guestWelcomeMessage;

    @GetMapping("/logout")
    public String logout(HttpSession session, 
                         Model model) {
        if(session.getAttribute("AuthSubject") != null) {
            session.setAttribute("AuthSubject", null);
            model.addAttribute("guestWelcomeMessage", guestWelcomeMessage);
            model.addAttribute("guestLoginRequired", true);
        }
        return "guest";
    }

}
