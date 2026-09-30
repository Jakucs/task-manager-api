package com.example.taskmanagerapi.service;

import com.example.taskmanagerapi.model.User;
import com.example.taskmanagerapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> getUserByID(int ID){
        return userRepository.findById(ID);
    }

    public User modifyUserByID(User user){
       return userRepository.save(user);
    }

    public void deleteUser(int ID){
        userRepository.deleteById(ID);
    }
}




















































/*
@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> findUserById(Integer id){
        return userRepository.findById(id);
    }

    public User modifyUserData(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Integer id){
         userRepository.deleteById(id);
    }

}*/
