package com.demo.service;

import java.util.List;

import com.demo.entity.Category;
import com.demo.entity.Product;

public interface CategoryService {
    
    Category createCategory(Category cat) ;
	 Category updateCategoryById(Category category,long id) ;	
    Category getCategoryById(long id) ;
	List<Category> getListOfCategory();	
	  String delById(long id);	
	 String delAll();
	 List<Category> getCategoryByName(String name) ;
}