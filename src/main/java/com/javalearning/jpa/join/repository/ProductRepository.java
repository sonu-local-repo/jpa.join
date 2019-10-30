package com.javalearning.jpa.join.repository;

import com.javalearning.jpa.join.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
