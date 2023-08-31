package com.bootcoding.saleapplication.service;

import com.bootcoding.saleapplication.model.Customer;
import com.bootcoding.saleapplication.repository.CustomerRepository;
import com.bootcoding.saleapplication.utils.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> placeOrder(int value)
    {
        List<Customer> name = new ArrayList<>();
        for(int i=0;i<value;i++) {
            Customer customer = Customer.builder().name(Name.name()).build();
            name.add(customer);
        }
        return customerRepository.saveAll(name);
    }

    public List<Customer> findAll() {
       return  customerRepository.findAll();
    }
}
