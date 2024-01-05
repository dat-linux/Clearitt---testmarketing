package com.clearitt.testmarketing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.clearitt.testmarketing.config.GuestProperties;
import com.clearitt.testmarketing.dto.AuthSubject;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * The main application. Acts as controller for primary landing pages.
 * 
 * @author  Louis Malenica
 */
@SpringBootApplication
@Controller
@EnableConfigurationProperties(GuestProperties.class)
public class TestmarketingApplication {

    @Value("${guest.welcome-message}")
    private String guestWelcomeMessage;
    @Value("${guest.welcome-message2}")
    private String guestWelcomeMessage2;

    public static void main(String[] args) {
        SpringApplication.run(TestmarketingApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/guest")
    public String guest(HttpServletResponse response, 
                        HttpServletRequest request, 
                        HttpSession session, 
                        Model model) {
        AuthSubject authSubject = null;
        if(session.getAttribute("AuthSubject") != null) {
            authSubject = (AuthSubject)session.getAttribute("AuthSubject");
        }
        if(authSubject == null || !authSubject.isLoggedIn()) {
            model.addAttribute("guestWelcomeMessage", guestWelcomeMessage);
            model.addAttribute("guestLoginRequired", true);
        } else {
            model.addAttribute("guestLoginRequired", false);
            model.addAttribute("guestWelcomeMessage", guestWelcomeMessage2);
            model.addAttribute("xeroAuthMap", authSubject.tokens());            
        }
        return "guest";
    }

}
