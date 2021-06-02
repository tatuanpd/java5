package com.io.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	//Blank = Empty + Null
	@NotBlank(message = "Name is mandatory")
	@Length(min = 5, max = 50)
	private String name;
	
	@NotBlank
	private String description;
	
	private Double price;
	
	private MultipartFile image;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}