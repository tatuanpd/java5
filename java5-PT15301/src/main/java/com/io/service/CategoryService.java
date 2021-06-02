package com.io.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.io.entities.Category;
@Service
public interface CategoryService {
	
	Category create(Category category);
	List<Category> readAll();
	Category read(Category category);
	Category update(Category category);
	Integer delete(Integer id);
//	List<Category> readPage(int pageSize,int pageNumber );
}
