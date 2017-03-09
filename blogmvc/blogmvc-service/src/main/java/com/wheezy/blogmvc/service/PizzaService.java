package com.wheezy.blogmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wheezy.blogmvc.model.Pizza;
import com.wheezy.blogmvc.repository.PizzaRepository;


@Service("PizzaService")
@Repository
public class PizzaService {

	
	private PizzaRepository pizzaRepository;

	@Autowired
	public PizzaService(PizzaRepository pizzaRepository) {
		this.pizzaRepository = pizzaRepository;
	}

	@Transactional
	public Pizza addPizza(Pizza pizza) {
		return this.pizzaRepository.save(pizza);
	}

	@Transactional
	public Pizza getPizzaByName(String name) {
		return this.pizzaRepository.findByName(name);
	}

	public List<Pizza> getAllPizzas() {
		return this.pizzaRepository.findAll();
	}
}
