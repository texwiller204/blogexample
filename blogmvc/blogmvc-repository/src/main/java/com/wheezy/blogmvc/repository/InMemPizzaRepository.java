package com.wheezy.blogmvc.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.wheezy.blogmvc.model.Pizza;
import com.wheezy.blogmvc.model.PizzaType;

import javax.annotation.PostConstruct;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class InMemPizzaRepository implements PizzaRepository {

    private Map<Integer, Pizza> pizzas;

    @SuppressWarnings("serial")
	@PostConstruct
    public void init() {
        pizzas = new HashMap<Integer, Pizza>() {{
            put(1, new Pizza( "meatPizza", 100.0, PizzaType.MEAT));
            put(2, new Pizza( "seaPizza", 150.0, PizzaType.SEA));
            put(3, new Pizza( "veganPizza", 124.0, PizzaType.VEGETARIAN));
        }};
    }



    public Pizza find(int id) {
        Pizza result = pizzas.get(id);
        if (result == null) {
            throw new IllegalArgumentException("There's no pizza with id = " + id);
        }
        return pizzas.get(id);
    }


	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteInBatch(Iterable<Pizza> arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Pizza> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Pizza> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Pizza> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Pizza> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Pizza> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Pizza getOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Pizza> List<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Pizza> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Page<Pizza> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void delete(Long arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Pizza arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(Iterable<? extends Pizza> arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public Pizza findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Pizza> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Pizza> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public <S extends Pizza> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public <S extends Pizza> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <S extends Pizza> S findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Pizza findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}