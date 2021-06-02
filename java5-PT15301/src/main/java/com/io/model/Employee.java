package com.io.model;

import org.springframework.stereotype.Component;

import lombok.Data;

//đanh dau class la mot bean
@Component(value="Employee")
public class Employee {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
