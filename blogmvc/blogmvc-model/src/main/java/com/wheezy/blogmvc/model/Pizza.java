package com.wheezy.blogmvc.model;


import javax.persistence.Entity;
import javax.persistence.Table;

import com.wheezy.blogmvc.model.base.IdEntity;



@SuppressWarnings("serial")
@Entity
@Table(name = "pizza")

public class Pizza extends IdEntity {
	
		
	private String name;
    private Double price;
    private PizzaType pizzaType;
	
    
	public Pizza( String name, Double price, PizzaType pizzaType) {        
        this.name = name;
        this.setPrice(price);
        this.setPizzaType(pizzaType);
    }

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public PizzaType getPizzaType() {
		return pizzaType;
	}


	public void setPizzaType(PizzaType pizzaType) {
		this.pizzaType = pizzaType;
	}
	
    @Override
    public String toString() {
        return "Pizza{" +                
                ", name='" + name + '\'' +
                ", price=" + price +
                ", pizzaType=" + pizzaType +
                '}';
    }
}
