package com.bootcoding.saleapplication.service;

import com.bootcoding.saleapplication.model.Customer;
import com.bootcoding.saleapplication.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer placeOrder(Customer customer)
    {
       return customerRepository.save(customer);
    }

    public List<Customer> findAll() {
       return  customerRepository.findAll();
    }
}
