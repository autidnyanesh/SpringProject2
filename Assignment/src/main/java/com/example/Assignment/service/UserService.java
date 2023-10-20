package com.example.Assignment.service;

import java.util.List;

import com.example.Assignment.model.User;

public interface UserService {
    public User adddUser(User obj);
     List <User> getAllUser();
}
