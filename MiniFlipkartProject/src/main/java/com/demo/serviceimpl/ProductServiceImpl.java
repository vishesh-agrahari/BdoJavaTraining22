package com.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Product;
import com.demo.repo.ProductRepository;
import com.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
    
	@Autowired
	ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) {

		Product p = productRepository.save(product);

		return p;
	}

	@Override
	public List<Product> getListOfProduct() {
		
		List<Product> resultedlist = productRepository.findAll();
		
		return resultedlist;
	}

	@Override
	public Product getProdutById(long id) {
		
		Optional<Product> getlist = productRepository.findById(id);
		Product p= getlist.get();
		return p;
	}

	@Override
	public Product updateProdutById(Product product, long id) {
		Optional<Product> getlist = productRepository.findById(id);
		Product p = getlist.get();
		p.setName(product.getName());
		p.setDescription(product.getDescription());
		p.setPrice(product.getPrice());
		
		
		return productRepository.save(p);
	}

	@Override
	public String delById(long id) {
	    productRepository.deleteById(id);
		return "deleted successfully";
	}

	@Override
	public String delAll() {
		productRepository.deleteAll();
		return "All Rows Deleted";
		
	}

	@Override
	public List<Product> getProdutByName(String name) {
        List<Product> resultedlist = productRepository.findByName(name);
		
		return resultedlist;
		
	}
}
