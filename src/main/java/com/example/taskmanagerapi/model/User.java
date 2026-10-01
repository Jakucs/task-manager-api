package com.example.taskmanagerapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="users")
public class User {
        @Id
        @GeneratedValue
        private int ID;

        @NotBlank
        private String userName;

        @NotBlank
        @Email
        private String email;

        @Pattern(regexp = "\\+?[0-9 /-]{7,15}", message = "Hibás telefonszám")
        private String phoneNumber;

        @NotBlank
        private String city;
        @NotBlank
        private String streetName;
        @NotBlank
        private String houseNumber;
        @NotBlank
        @Pattern(regexp = "\\d{4}", message = "Az irányítószám 4 számjegy")
        private String zipcode;

        public User() {

        }

        public User(String userName, String email){
            this.userName = userName;
            this.email = email;
        }

    public int getID() {
        return ID;
    }

    public String getCity() {
        return city;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
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
