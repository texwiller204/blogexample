package com.wheezy.blogmvc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wheezy.blogmvc.model.Pizza;
import com.wheezy.blogmvc.service.PizzaService;


@Controller
@RequestMapping(value ="/pizza")

public class PizzaController {

    private PizzaService pizzaService;


    @Autowired
    public PizzaController(final PizzaService pizzaService){
        this.pizzaService = pizzaService;
    }

    @RequestMapping(value ="/pizzaList", method = RequestMethod.GET)
    @ResponseBody
    public List<Pizza> getPizzaList(){
        return pizzaService.getAllPizzas();
    }
}