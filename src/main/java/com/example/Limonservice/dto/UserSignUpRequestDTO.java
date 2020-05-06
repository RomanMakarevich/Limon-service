package com.example.Limonservice.dto;

import lombok.Data;

@Data
public class UserSignUpRequestDTO {
    String email;
    String name;
    String password;
    String phone;
}
