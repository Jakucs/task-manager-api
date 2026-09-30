package com.example.taskmanagerapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
        @Id
        @GeneratedValue
        private int ID;
        private String userName;
        private String email;

        public User() {

        }

        public User(String userName, String email){
            this.userName = userName;
            this.email = email;
        }


        public void setEmail(String email) {
            this.email = email;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getEmail() {
            return email;
        }

        public String getUserName() {
            return userName;
        }
    }




























































/*@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String userName;
    private String email;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
}*/
