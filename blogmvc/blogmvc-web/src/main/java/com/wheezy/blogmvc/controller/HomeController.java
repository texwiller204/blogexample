package com.wheezy.blogmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wheezy.blogmvc.repository.PizzaRepository;

@Controller
public class HomeController {

	
    private final String WELCOME = "welcome";
    @Autowired
    private Environment environment;

    

	@RequestMapping({"/","/welcome"})
	public String welcome(Model model) {
		model.addAttribute("greeting", "Welcome to Web Store!");
		model.addAttribute("tagline", "The one and only amazing web store");
		
		 return WELCOME;
	}
	
	@RequestMapping("/welcome/greeting")
	public String greeting() {
		 return WELCOME;
	}
	

	
}