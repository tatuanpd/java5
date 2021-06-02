package com.io.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.io.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
//	Page<Category> page(Pageable page);
}
