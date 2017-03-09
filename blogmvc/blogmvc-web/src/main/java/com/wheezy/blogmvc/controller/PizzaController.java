package com.wheezy.blogmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wheezy.blogmvc.model.Pizza;
import com.wheezy.blogmvc.model.PizzaType;
import com.wheezy.blogmvc.service.PizzaService;

@Controller
public class PizzaController {

    @Autowired
    @Qualifier("PizzaService")
    private PizzaService pizzaService;

    public PizzaController() {
    	
    	pizzaService.addPizza(new Pizza("Pizza2", 23.0, PizzaType.MEAT));
    	pizzaService.addPizza(new Pizza("Pizza1", 13.0, PizzaType.SEA));
    }

    @RequestMapping("/pizzas")
	public String index(Model model) {
    	
        System.out.println(pizzaService.getAllPizzas());
        model.addAttribute("pizzas", pizzaService.getAllPizzas());
        
        return "welcome";
    }
}