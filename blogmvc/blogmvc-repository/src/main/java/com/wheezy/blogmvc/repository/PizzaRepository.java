package com.wheezy.blogmvc.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wheezy.blogmvc.model.Pizza;



@Repository
public interface  PizzaRepository extends JpaRepository<Pizza, Long> {
	
	Pizza findByName(String name);
	
}
