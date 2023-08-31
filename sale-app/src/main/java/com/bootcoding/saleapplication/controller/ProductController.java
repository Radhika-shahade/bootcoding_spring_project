package com.bootcoding.saleapplication.controller;

import com.bootcoding.saleapplication.model.Product;
import com.bootcoding.saleapplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    @PostMapping("/products/{value}")
    public List<Product> insertData(@PathVariable("value") int value)
    {
        return  productService.save(value);
    }


}
