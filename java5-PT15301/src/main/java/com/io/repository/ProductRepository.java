package com.io.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.io.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
