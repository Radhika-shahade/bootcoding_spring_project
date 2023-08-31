package com.bootcoding.saleapplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    private List<Product>products;
}
