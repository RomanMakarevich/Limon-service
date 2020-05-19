package com.example.Limonservice.mapper;

import com.example.Limonservice.dto.AddCarDTO;
import com.example.Limonservice.dto.MileageDTO;
import org.hibernate.engine.spi.ManagedEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MileageMapper {
    ManagedEntity sourceToCestination(MileageDTO source);

   MileageDTO destinationToSource(ManagedEntity destination);
}
