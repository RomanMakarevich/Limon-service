package com.example.Limonservice.service;

import com.example.Limonservice.converter.CarConverter;
import com.example.Limonservice.dto.AddCarDTO;
import com.example.Limonservice.entity.CarEntity;
import com.example.Limonservice.repository.CarRepository;
import com.example.Limonservice.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddCarService {

    final CarRepository carRepository;
    final CarConverter carConverter;
    final UserRepository userRepository;

    public void addCar(final Long userId, final AddCarDTO addCarDTO) {
        CarEntity carEntity = carConverter.DTOToEntity(addCarDTO);
        carEntity.setUserEntity(userRepository.getOne(userId));
        carRepository.save(carEntity);
    }
}