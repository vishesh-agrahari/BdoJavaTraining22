package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table
@Entity
public class Category {
     
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String categoryname;
	
	public Category() {
		super();
	}
	public Category(long id, String categoryname) {
		super();
		this.id = id;
		this.categoryname = categoryname;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
	
	
	
}
