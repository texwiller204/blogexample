package com.wheezy.blogmvc.model;


import javax.persistence.Entity;
import javax.persistence.Table;

import com.wheezy.blogmvc.model.base.IdEntity;



@SuppressWarnings("serial")
@Entity
@Table(name = "pizza")

public class Pizza extends IdEntity {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
