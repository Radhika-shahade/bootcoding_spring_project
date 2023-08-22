package com.bootcodig.couponsystem.controller;

import com.bootcodig.couponsystem.model.User;
import com.bootcodig.couponsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userservice;

    @PostMapping("/register")
    public String register(@RequestBody List<User> users)
    {
        userservice.saveUser(users);
        return "success";
    }



}
