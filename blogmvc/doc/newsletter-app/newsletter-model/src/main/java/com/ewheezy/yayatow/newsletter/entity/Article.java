package com.ewheezy.yayatow.newsletter.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import com.ewheezy.yayatow.newsletter.entity.base.AbstractEntity;

@Entity
@Table(name = "article")
public class Article  extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@NotEmpty
	@Email
	private String title;
	
	
	private String image;
	
	
	private String description;
	
	public Article() {
		super();
	}
	public Article(String title, String image, String description) {
		super();
		this.title = title;
		this.image = image;
		this.description = description;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}		
	
}
