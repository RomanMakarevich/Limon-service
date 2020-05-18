package com.example.Limonservice.service;

import com.example.Limonservice.converter.CarConverter;
import com.example.Limonservice.dto.UserAddCarDTO;
import com.example.Limonservice.entity.CarEntity;
import com.example.Limonservice.repository.CarRepository;
import com.example.Limonservice.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserAddCarService {

    final CarRepository carRepository;
    final CarConverter carConverter;
    final UserRepository userRepository;

    public void addCar(final Long userId, final UserAddCarDTO userAddCarDTO) {
        CarEntity carEntity = carConverter.DTOToEntity(userAddCarDTO);
        carEntity.setUserEntity(userRepository.getOne(userId));
        carRepository.save(carEntity);
    }
}