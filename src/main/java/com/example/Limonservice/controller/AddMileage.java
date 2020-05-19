package com.example.Limonservice.controller;

import com.example.Limonservice.dto.MileageDTO;
import com.example.Limonservice.service.AddMileageService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.java.Log;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Log
@Data
@RestController
@AllArgsConstructor
public class AddMileage {

    private final AddMileageService addMileageService;

    @PostMapping(value = "/limon-service/{userId}/cars/{carId}/mileage", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addMilege(@PathVariable final Long userId, @RequestParam("carId") final Long carId, @RequestBody final MileageDTO mileageDTO){
        addMileageService.addMileage(userId, carId, mileageDTO);
    }
}
