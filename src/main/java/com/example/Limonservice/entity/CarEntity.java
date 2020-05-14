package com.example.Limonservice.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String make;
    private String model;
    private String vin;
    private long releaseYear;
    private String engine_type;
    private String type_of_transmission;
    private long mileage;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity userEntity;
}
