package com.spring.controller;

import java.util.Locale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.spring.model.User;
import com.spring.service.UserService;

@Controller
public class UserController {
 
    @Autowired
    private UserService userService;
 
    @GetMapping("/")
    public String userForm(Locale locale, Model model) {
        model.addAttribute("users", userService.list());
        return "Systems";
    }
     
    @ModelAttribute("user")
    public User formBackingObject() {
        return new User();
    }
 
   
}