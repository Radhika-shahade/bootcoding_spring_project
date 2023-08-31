package com.bootcoding.saleapplication.service;

import com.bootcoding.saleapplication.model.Customer;
import com.bootcoding.saleapplication.model.Product;
import com.bootcoding.saleapplication.repository.ProductRepository;
import com.bootcoding.saleapplication.utils.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> save(int value) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            Product product = Product.builder().productName(Products.product())
                    .prize(Products.prize()).build();
            products.add(product);
        }
        return productRepository.saveAll(products);
    }

}
