package com.wheezy.blogmvc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wheezy.blogmvc.repository.PizzaRepository;

@Controller
@RequestMapping("/pizza")
public class PizzaController {

    @Autowired
    private PizzaRepository pizzaRepository;

    public PizzaController() {
    }

    @RequestMapping(value = "/pizzaList", method = RequestMethod.GET)
    public String pizzas(Model model) {
        System.out.println(pizzaRepository.findAll());
        model.addAttribute("pizzas", pizzaRepository.findAll());
        return "pizza/pizzas";
    }
}