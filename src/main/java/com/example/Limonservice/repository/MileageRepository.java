package com.example.Limonservice.repository;

import com.example.Limonservice.entity.MileageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MileageRepository extends JpaRepository<MileageEntity,Long> {
}
