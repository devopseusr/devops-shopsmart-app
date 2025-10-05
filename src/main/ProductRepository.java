package com.shopsmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.shopsmart.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
