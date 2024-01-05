package com.clearitt.testmarketing.controller.xero;

import org.springframework.web.bind.annotation.RequestMapping;

import com.clearitt.testmarketing.dto.xero.XeroAuthSubject;
import com.clearitt.testmarketing.service.xero.XeroApiService;
import com.xero.models.accounting.Contacts;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for interactng with Xero API for "contacts" data.
 * 
 * @author Louis Malenica
 * @see    com.clearitt.testmarketing.controller.advice.ControllerExceptionAdvice
 */
@Controller
@RequestMapping("/xero/contacts")
public class XeroContactsController {
    
	@Autowired
	XeroApiService xeroApiService;

    @GetMapping("")
    public String getContacts(HttpServletResponse response, 
							  HttpSession session, 
							  Model model) {
		XeroAuthSubject authSubject = (XeroAuthSubject)session.getAttribute("AuthSubject");
		Contacts contacts = xeroApiService.findAllContacts(authSubject);
		model.addAttribute("Contacts", contacts.getContacts());
        return "fragments :: #xeroContacts";
    }

}
