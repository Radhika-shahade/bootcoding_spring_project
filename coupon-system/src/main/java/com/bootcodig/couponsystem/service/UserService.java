package com.bootcodig.couponsystem.service;

import com.bootcodig.couponsystem.model.User;
import com.bootcodig.couponsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
@Autowired
private UserRepository userrepository;
    public void saveUser(User user)
    {
        userrepository.save(user);
    }
    public void saveUser(List<User> user)
    {
        for(User data :user)
        {
            System.out.println( data);
       userrepository.save(data);
        }
    }



}
