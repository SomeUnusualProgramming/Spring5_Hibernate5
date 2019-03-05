package com.spring.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.spring.model.Client;
import com.spring.service.AgreementsService;

@Controller
public class AgreementsController {

	 @Autowired
	    private AgreementsService agreementsService;
	    
	    @GetMapping("/agreements")
	    public String agreementsForm(Locale locale, Model model) {
	    	model.addAttribute("clients", agreementsService.list());
	    	return "active";
	    }
	    
	    @ModelAttribute("client")
	    public Client formBackingObject() {
	    	return new Client();
	    }
	
}
