package com.io.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.io.entities.Category;
import com.io.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category create(Category category) {

		return categoryRepository.save(category);
	}

	@Override
	public List<Category> readAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Category read(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category update(Category category) {
		return categoryRepository.save(category);
	}

	@Override
	public Integer delete(Integer id) {
		categoryRepository.deleteById(id);
		return id;
	}

//	@Override
//	public List<Category> readPage(int pageSize, int pageNumber) {
////		Pageable pageable = (Pageable) PageRequest.of(pageNumber, pageSize);
////		Page<Category> page= categoryRepository.page(pageable);
//	
//		return null;
//	}

}
