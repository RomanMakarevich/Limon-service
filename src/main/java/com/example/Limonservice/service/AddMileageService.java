package com.example.Limonservice.service;

import com.example.Limonservice.converter.MileageConverter;
import com.example.Limonservice.dto.MileageDTO;
import com.example.Limonservice.entity.MileageEntity;
import com.example.Limonservice.repository.CarRepository;
import com.example.Limonservice.repository.MileageRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AddMileageService {

    private final MileageRepository mileageRepository;
    private final CarRepository carRepository;
    private final MileageConverter mileageConverter;

    public void addMileage(final Long userId, final Long carId, final MileageDTO mileageDTO) {
        final MileageEntity mileageEntity = mileageConverter.DTOToEntity(mileageDTO);
        mileageEntity.setCarEntity(carRepository.getOne(carId));
        mileageRepository.save(mileageEntity);
    }
}
