package com.wheezy.blogmvc.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wheezy.blogmvc.model.Pizza;

public interface  PizzaRepository extends JpaRepository<Pizza, Long> {

	
	Pizza findByName(String name);
}
