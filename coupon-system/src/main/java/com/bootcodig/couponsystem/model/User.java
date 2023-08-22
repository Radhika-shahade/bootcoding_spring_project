package com.bootcodig.couponsystem.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

@Entity
@Table(name="app_user")
public class User {
    @Id
    @GeneratedValue
    private int id;

    @Column(name= "first_name")
    private  String firstName;

    @Column (name="last_name")
    private String lastName;

    @Column(name= "email_id")
    private String emailId;

    @Column (name="phone")
    private long phoneNo;

}
