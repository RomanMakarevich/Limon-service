package com.example.Limonservice.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "mileage")
public class MileageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long mileage;
    private Date data;
    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private CarEntity carEntity;
}
