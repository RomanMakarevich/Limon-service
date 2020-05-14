package com.example.Limonservice.service;

import com.example.Limonservice.converter.CarConverter;
import com.example.Limonservice.dto.UserAddCarDTO;
import com.example.Limonservice.entity.CarEntity;
import com.example.Limonservice.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserAddCarService {

    final CarRepository carRepository;
    final CarConverter carConverter;

    public void addCar(final UserAddCarDTO userAddCarDTO) {
        CarEntity carEntity =carConverter.DTOToEntity(userAddCarDTO);

                carRepository.save(carEntity);
    }
}
