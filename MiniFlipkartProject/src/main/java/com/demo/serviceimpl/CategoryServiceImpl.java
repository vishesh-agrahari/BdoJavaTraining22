package com.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Category;
import com.demo.entity.Product;
import com.demo.repo.CategoryRepository;
import com.demo.service.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category createCategory(Category cat) {

		Category c = categoryRepository.save(cat);

		return c;
	}

	@Override
	public List<Category> getListOfCategory() {
		
		List<Category> catlist = categoryRepository.findAll();
		
		return catlist;
	}
	
	@Override
	public Category getCategoryById(long id) {
		Optional<Category> getlist = categoryRepository.findById(id);
		Category c = getlist.get();
		return c;
	}

	@Override
	public Category updateCategoryById(Category category, long id) {
		Optional<Category> getlist = categoryRepository.findById(id);
		Category c = getlist.get();
		c.setCategoryname(category.getCategoryname());
	    return categoryRepository.save(c);
	}

	@Override
	public String delById(long id) {
		categoryRepository.deleteById(id);
		return "deleted successfully";
	}

	@Override
	public String delAll() {
		categoryRepository.deleteAll();
		return "All Rows Deleted";
	}

	@Override
	public List<Category> getCategoryByName(String name) {
          List<Category> resultedlist = categoryRepository.findByCategoryname(name);
		
		return resultedlist;
	}



	
}
