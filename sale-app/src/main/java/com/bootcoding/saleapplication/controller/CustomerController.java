package com.bootcoding.saleapplication.controller;

import com.bootcoding.saleapplication.model.Customer;
import com.bootcoding.saleapplication.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")

public class CustomerController {
    @Autowired
    private CustomerService customerService;
@PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody Customer customer)
    {
        return customerService.placeOrder(customer);
    }
    @GetMapping("/orders")
    public List<Customer> findAllOrder(){
    return customerService.findAll();
    }


}
