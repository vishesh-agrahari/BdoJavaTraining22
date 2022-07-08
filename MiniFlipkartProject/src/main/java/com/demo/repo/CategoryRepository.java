package com.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

	List<Category> findByCategoryname(String name);
	
	 
}
