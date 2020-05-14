package com.example.Limonservice.mapper;


import com.example.Limonservice.dto.UserAddCarDTO;
import com.example.Limonservice.entity.CarEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarMapper {
    CarEntity sourceToCestination(UserAddCarDTO source);

    UserAddCarDTO destinationToSource(CarEntity destination);
}
