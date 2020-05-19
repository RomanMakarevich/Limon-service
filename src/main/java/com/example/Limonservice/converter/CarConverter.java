package com.example.Limonservice.converter;

import com.example.Limonservice.dto.AddCarDTO;
import com.example.Limonservice.entity.CarEntity;
import org.springframework.stereotype.Component;

@Component
public class CarConverter {

    public CarEntity DTOToEntity(AddCarDTO dto){
        final CarEntity carEntity = new CarEntity();
        carEntity.setMake(dto.getMake());
        carEntity.setModel(dto.getModel());
        carEntity.setEngine_type(dto.getEngineType());
        carEntity.setType_of_transmission(dto.getTypeOfTransmission());
        carEntity.setReleaseYear(dto.getReleaseYear());
        carEntity.setVin(dto.getVin());
        return carEntity;
    }
}
