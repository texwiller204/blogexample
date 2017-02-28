package com.ewheezy.yayatow.newsletter.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.ewheezy.yayatow.newsletter.entity.base.AbstractNamedEntity;


@Entity
@Table(name = "role")
public class UserRole extends AbstractNamedEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Enumerated(EnumType.STRING)
	private LoginType role_type;



	public LoginType getRole_type() {
		return role_type;
	}

	public void setRole_type(LoginType role_type) {
		this.role_type = role_type;
	}

	public String getTypeText() {
		return this.role_type.name().toLowerCase();
	}	
	
	public String toString() {
		return "Role[ Name: " + getName() + " Type: " + getTypeText() + "]\n";				
	}


}
