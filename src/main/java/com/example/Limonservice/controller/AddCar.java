package com.example.Limonservice.controller;

import com.example.Limonservice.dto.AddCarDTO;
import com.example.Limonservice.service.AddCarService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.java.Log;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Log
@Data
@RestController
@AllArgsConstructor

public class AddCar {
    final AddCarService addCarService;

    @PostMapping(value = "/limon-service/{userId}/cars", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addCar(@PathVariable final Long userId, @RequestBody final AddCarDTO addCarDTO) {
        addCarService.addCar(userId, addCarDTO);
    }
}
