package com.bootcoding.saleapplication.repository;

import com.bootcoding.saleapplication.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
