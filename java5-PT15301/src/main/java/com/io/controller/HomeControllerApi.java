package com.io.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.io.model.Employee;

@RestController
public class HomeControllerApi {
	@Autowired
	private HttpServletRequest request;
	
//	@Autowired
//	public HomeControllerApi(HttpServletRequest request,@Qualifier("Employee1")Employee employee,@Qualifier("Employee2") Employee employee2) {
//		this.employee= employee;
//		this.employee2= employee2;
//	}
	
//	@Autowired
//	@Qualifier("Employee1")
//	private Employee employee;
//	
//	@Autowired
//	@Qualifier("Employee2")
//	private Employee employee2;
	
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
//
//	@GetMapping("/hello/jv4")
//	public String hellojv4() {
//		String name = request.getParameter("name");
//		return String.format("Hello %s %s!", name,employee.getName());
//	}
//	@GetMapping("/hello/jv4v2")
//	public String hellojv4v2() {
//		String name = request.getParameter("name");
//		return String.format("Hello %s %s!", name,employee2.getName());
//	}
}
