package com.example.taskmanagerapi.service;

import com.example.taskmanagerapi.dto.UserRequest;
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

    public User addUser(UserRequest request){
        User user = new User();
        user.setUserName(request.getUserName());
        user.setEmail(request.getEmail());
        user.setPhoneNumber(request.getPhoneNumber());
        user.setCity(request.getCity());
        user.setStreetName(request.getStreetName());
        user.setHouseNumber(request.getHouseNumber());
        user.setZipcode(request.getZipcode());
        return userRepository.save(user);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

    public Optional<User> getUserByID(int ID){
        return userRepository.findById(ID);
    }

    public Optional<User> modifyUserByID(int ID, UserRequest request){
        Optional<User> user1 = userRepository.findById(ID);
        if (user1.isPresent()) {
            User existing = user1.get();
            existing.setUserName(request.getUserName());
            existing.setEmail(request.getEmail());
            existing.setPhoneNumber(request.getPhoneNumber());
            existing.setCity(request.getCity());
            existing.setStreetName(request.getStreetName());
            existing.setHouseNumber(request.getHouseNumber());
            existing.setZipcode(request.getZipcode());
            User saved = userRepository.save(existing);
            return Optional.of(saved);
        }
        return Optional.empty();
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
