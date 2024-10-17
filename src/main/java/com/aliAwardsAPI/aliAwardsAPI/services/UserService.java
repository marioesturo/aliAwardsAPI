package com.aliAwardsAPI.aliAwardsAPI.services;

import com.aliAwardsAPI.aliAwardsAPI.exceptions.ResourceNotFoundException;
import com.aliAwardsAPI.aliAwardsAPI.models.User;
import com.aliAwardsAPI.aliAwardsAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found"));
    }

}