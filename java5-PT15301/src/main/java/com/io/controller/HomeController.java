package com.io.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	
	@GetMapping( value={"/home","/","/index"})
	public String homePage(Model model ){
		model.addAttribute("tuantv","ta van tuan");
		return "index";
	}
	@GetMapping("/products")
	public String productPage(Model model ){
		model.addAttribute("user","ta van tuan");
		return "products/list";
	}
	@GetMapping("/products/{id}") 
	public String productPage3(@PathVariable("id") Integer id ,Model model) {
		model.addAttribute("user", id);
		return "products/list";
	}
}
