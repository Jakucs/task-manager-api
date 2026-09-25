package com.example.taskmanagerapi.service;

import com.example.taskmanagerapi.model.User;
import com.example.taskmanagerapi.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }
}
