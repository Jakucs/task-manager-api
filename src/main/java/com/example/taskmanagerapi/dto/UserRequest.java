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
}
