package com.example.taskmanagerapi.repository;

import com.example.taskmanagerapi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
