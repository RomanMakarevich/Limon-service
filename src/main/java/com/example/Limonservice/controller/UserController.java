package com.example.Limonservice.controller;

import com.example.Limonservice.dto.UserSignUpRequestDTO;
import com.example.Limonservice.service.UserService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.java.Log;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@Data
@RestController
@AllArgsConstructor
@RequestMapping("/limon-service/users")
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/sign-up", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void singUp(@RequestBody final UserSignUpRequestDTO request) {
        userService.signUp(request);
    }
}
