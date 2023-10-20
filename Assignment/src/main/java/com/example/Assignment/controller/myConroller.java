package com.example.Assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Assignment.model.User;
import com.example.Assignment.service.UserServiceIMPL;

@Controller
public class myConroller {
    @Autowired
    UserServiceIMPL service1;

    @GetMapping("/index1")
        public String UserForm(){
            return "index";
        }
     @PostMapping("/index1")
     public String signupFormSubmit(@ModelAttribute User user) {
        System.out.println("login");
        service1.adddUser(user);  
        return "index";
    }
     @GetMapping("/showAllUsers")
      public String listUsers(Model model) {
      List<User> users = service1.getAllUser(); // Retrieve all user records
      model.addAttribute("users", users);
      return "showAllUsers"; // Thymeleaf template name
    }

}
