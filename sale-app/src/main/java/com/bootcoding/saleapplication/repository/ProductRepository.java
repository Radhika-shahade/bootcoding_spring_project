package com.bootcoding.saleapplication.repository;

import com.bootcoding.saleapplication.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
