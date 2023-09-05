package com.bootcoding.saleapplication.controller;

import com.bootcoding.saleapplication.model.Customer;
import com.bootcoding.saleapplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")

public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/placeOrder/{value}")
    public ResponseEntity<List<Customer>> placeOrder(@PathVariable int value) {
        List<Customer> customers = customerService.placeOrder(value);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("description", "inserting details");
        return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(customers);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<Customer>> findAllOrder() {
        List<Customer> customers = customerService.findAll();
        HttpHeaders header = new HttpHeaders();
        header.add("description", "Getting all customers details");
        return ResponseEntity.status(HttpStatus.OK).headers(header).body(customers);
    }




}
