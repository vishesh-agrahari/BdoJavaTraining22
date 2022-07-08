package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Product;
import com.demo.service.ProductService;

@RestController
public class ProductController {
 
	@Autowired
	ProductService productService;

	
	@PostMapping(value = "/addproduct")
	Product addProduct(@RequestBody Product product) {

		Product p = productService.createProduct(product);

		return p;

	}
    
	@GetMapping(value="/getlistofproducts") 
	List<Product> getListOfproducts(){

		List<Product> resutedlist = productService.getListOfProduct();
		return resutedlist;

	}
	
	@GetMapping(value="/getproductbyid/{id}") 
	 Product  getProductById(@PathVariable long id){

		Product resutedlist = productService.getProdutById(id);
		return resutedlist;

	}
	@PutMapping(value="/updatebyid/{id}")
	Product updateProductById(@RequestBody Product product,@PathVariable long id) {
		Product p = productService.updateProdutById(product, id);
		return p;
	}
	@PostMapping(value="/delproductbyid/{id}")
	void delProductById(@PathVariable long id) {
		System.out.println(productService.delById(id));
	}
	
	@PostMapping(value="/delall")
	void delAllProduct(){
		System.out.println(productService.delAll());
	}
	@GetMapping(value="/getbyname/{name}")
	List<Product> getProductByName(@PathVariable String name){

		List<Product> resutedlist = productService.getProdutByName(name);
		return resutedlist;

	}
}
