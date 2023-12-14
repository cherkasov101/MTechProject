package com.mtech.mtech.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.mtech.mtech.models.CarBody;
import com.mtech.mtech.repositories.CarBodyRepository;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
public class CarBodyController {
    private final CarBodyRepository carBodyRepository;

    public CarBodyController(CarBodyRepository carBodyRepository) {
        this.carBodyRepository = carBodyRepository;
    }

    @GetMapping("/get_all_car_bodies")
    public List<CarBody> getAllCarBodies() {
        return carBodyRepository.findAll();
    }
}