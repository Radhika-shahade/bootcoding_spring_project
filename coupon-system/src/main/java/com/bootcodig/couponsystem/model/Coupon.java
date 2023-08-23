package com.bootcodig.couponsystem.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Builder
@Table(name = "coupon_application")
public class Coupon {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String description;
    @Column(name = "couponCode")
    private String couponCode;
    private String type;
    @Column(name = "validityDate")
    private Date validityDate;
    private double discount;
    private String category;
    @Column(name = "create_date")
    private Date createDate;
    private String createBy;
    private Boolean isActive;
    private String status;




}
