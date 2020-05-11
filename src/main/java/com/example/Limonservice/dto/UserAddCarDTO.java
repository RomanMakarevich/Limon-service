package com.example.Limonservice.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserAddCarDTO {
    String make;
    String model;
    String vin;
    Integer releaseYear;
    String engineType;
    String typeOfTransmission;
    Integer mileage;
    Date date;
}
