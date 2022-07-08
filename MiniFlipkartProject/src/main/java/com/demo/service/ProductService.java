package com.demo.service;

import java.util.List;

import com.demo.entity.Product;

public interface ProductService {
      
     Product createProduct(Product product) ;
	
	 Product updateProdutById(Product product,long id) ;
	
     Product getProdutById(long id) ;

	List<Product> getListOfProduct();
	
	  String delById(long id);
	
	 String delAll();
	 
	 List<Product> getProdutByName(String name) ;
	 
}
