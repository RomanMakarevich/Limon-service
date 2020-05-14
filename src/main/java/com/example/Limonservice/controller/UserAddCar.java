package com.example.Limonservice.controller;

import com.example.Limonservice.dto.UserAddCarDTO;
import com.example.Limonservice.service.UserAddCarService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.java.Log;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Log
@Data
@RestController
@AllArgsConstructor

public class UserAddCar {
    final UserAddCarService userAddCarService;

    @PostMapping(value = "/limon-service/cars", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addCar(@RequestBody final UserAddCarDTO userAddCarDTO) {
        userAddCarService.addCar(userAddCarDTO);
    }
}
