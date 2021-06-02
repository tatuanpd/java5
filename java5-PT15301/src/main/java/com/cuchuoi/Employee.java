package com.cuchuoi;

import org.springframework.stereotype.Component;

import lombok.Data;

//đanh dau class la mot bean
@Component(value="Employee2")

public class Employee {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
