package com.example.Assignment.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Assignment.model.User;

public interface UserRepo extends JpaRepository<User, Integer>{
    
}
