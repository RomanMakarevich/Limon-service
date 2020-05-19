package com.example.Limonservice.converter;

import com.example.Limonservice.dto.MileageDTO;
import com.example.Limonservice.entity.MileageEntity;
import org.springframework.stereotype.Component;

@Component
public class MileageConverter {
    public MileageEntity DTOToEntity(MileageDTO mileageDTO){
        final MileageEntity mileageEntity = new MileageEntity();
        mileageEntity.setMileage(mileageDTO.getMileage());
        mileageEntity.setDate(mileageDTO.getDate());

        return mileageEntity;
    }
}
