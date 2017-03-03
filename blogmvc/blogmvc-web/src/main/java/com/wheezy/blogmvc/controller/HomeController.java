package com.wheezy.blogmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

	@RequestMapping("/")   
    public String welcome(Model model) {
        model.addAttribute("greeting", "gretting!!!");
        model.addAttribute("tagline", "it works");
        
        return "welcome";
    }
}