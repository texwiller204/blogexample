package com.wheezy.blogmvc.model.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.hibernate.validator.constraints.NotEmpty;


@MappedSuperclass
public class AbstractNamedEntity extends AbstractEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	private String name;

	@Column(name="name", length=255)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}