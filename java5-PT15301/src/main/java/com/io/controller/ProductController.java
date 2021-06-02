package com.io.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.io.model.Product;

@Controller
public class ProductController {

	@GetMapping("/product/create")
	public String viewCreate(Model model){
		model.addAttribute("productForm", new Product());
		return "admin/products/create";
	} 
	
	@PostMapping("/product/create")
	public String saveProduct(@Validated @ModelAttribute("productForm") Product product, BindingResult bindingResult, Model model){
		//1. Validate Product
		boolean check = bindingResult.hasErrors();
		
		//2. if (validate ok) => save ok => Show message success
		if(!check) {
			//TODO save product
//			MultipartFile image = product.getImage();
			
			
			model.addAttribute("message", "Save product is successfuly");
			//3. else   = => Show error message
			return "admin/products/list";
		} else {
			//3. else   = => Show error message
			return "admin/products/create";
		}
	} 
}
