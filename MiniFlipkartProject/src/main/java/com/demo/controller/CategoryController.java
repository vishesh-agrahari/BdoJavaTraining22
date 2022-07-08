package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Category;
import com.demo.entity.Product;
import com.demo.service.CategoryService;

@RestController
public class CategoryController {

	
	@Autowired
	CategoryService categoryService;

	
	@PostMapping(value = "/addcategory")
	Category addCategory(@RequestBody Category category) {

		Category c = categoryService.createCategory(category);

		return c;

	}
    
	@GetMapping(value="/getlistofcategory") 
	List<Category> getListCategory(){

		List<Category> resutedlist = categoryService.getListOfCategory();
		return resutedlist;

	}
	
	@GetMapping(value="/getcategorybyid/{id}") 
	Category  getCategoryById(@PathVariable long id){

		Category resutedlist = categoryService.getCategoryById(id);
		return resutedlist;

	}
	
	@PutMapping(value="/updatecatbyid/{id}")
	Category updateProductById(@RequestBody Category category,@PathVariable long id) {
		Category c = categoryService.updateCategoryById(category, id);
		return c;
	}
	
	@PostMapping(value="/delcategorybyid/{id}")
	void delCategoryById(@PathVariable long id) {
		System.out.println(categoryService.delById(id));
	}
	
	@PostMapping(value="/delallcat")
	void delAllCategory(){
		System.out.println(categoryService.delAll());
	}
	
	@GetMapping(value="/getbycatname/{name}")
	List<Category> getCategoryByName(@PathVariable String name){

		List<Category> resutedlist = categoryService.getCategoryByName(name);
		return resutedlist;

	}
}
