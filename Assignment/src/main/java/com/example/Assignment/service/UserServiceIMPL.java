package com.example.Assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Assignment.model.User;
import com.example.Assignment.repository.UserRepo;
@Service
public class UserServiceIMPL implements UserService {

    @Autowired
    UserRepo repo;

    @Override
    public User adddUser(User obj) {
        return repo.save(obj);   
       
    }

    @Override
    public List<User> getAllUser() {
        return repo.findAll();
    }
    
}
