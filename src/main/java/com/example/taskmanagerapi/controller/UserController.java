package com.example.taskmanagerapi.controller;

import com.example.taskmanagerapi.dto.UserRequest;
import com.example.taskmanagerapi.model.User;
import com.example.taskmanagerapi.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;



@RestController
@RequestMapping("/users")
public class UserController{

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public User addUser(@Valid @RequestBody UserRequest user){
        return userService.addUser(user);
    }

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserByID(@PathVariable Integer id){
        return userService.getUserByID(id);
    }

    @PutMapping("/{id}")
    public Optional<User> modifyUser(@PathVariable Integer id, @Valid @RequestBody UserRequest user){
        return userService.modifyUserByID(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }
}



















































/*
@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Integer id){
        return userService.findUserById(id);
    }

    @PutMapping
    public User modifyUser(@RequestBody User user){
        return userService.modifyUserData(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }
}*/
