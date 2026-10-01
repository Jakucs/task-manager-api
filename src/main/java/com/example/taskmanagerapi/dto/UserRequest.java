package com.example.taskmanagerapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UserRequest {

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
    @Pattern(regexp = "\\d{4}", message = "Az irányítószám 4 számjegy")
    private String zipcode;

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
