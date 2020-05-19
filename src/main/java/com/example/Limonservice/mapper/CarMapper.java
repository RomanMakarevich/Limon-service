package com.example.Limonservice.mapper;


import com.example.Limonservice.dto.AddCarDTO;
import com.example.Limonservice.entity.CarEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarEntity sourceToCestination(AddCarDTO source);

    AddCarDTO destinationToSource(CarEntity destination);
}
