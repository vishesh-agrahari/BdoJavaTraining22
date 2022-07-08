package com.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Table
@Entity
public class Product {
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private long price;
	private String name;
	private String description;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="fk_product_id",referencedColumnName="id")
	private Category category;
	
	
	
	public Product() {
		super();
		
	}
	public Product(long price, String name, String description, Category category) {
		super();
		this.price = price;
		this.name = name;
		this.description = description;
		this.category = category;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
