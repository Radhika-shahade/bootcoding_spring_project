package com.bootcoding.saleapplication.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String productName;
    private double prize;
    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "id")
    private Customer customer;
}
