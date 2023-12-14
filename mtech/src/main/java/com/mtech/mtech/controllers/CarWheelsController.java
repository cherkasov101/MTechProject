package com.mtech.mtech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mtech.mtech.models.CarWheels;
import com.mtech.mtech.services.CarWheelsService;
import java.util.List;

@RestController
@RequestMapping("/car-wheels")
public class CarWheelsController {
    
    @Autowired
    private CarWheelsService carWheelsService;
    
    @GetMapping
    public List<CarWheels> getAllCarWheels() {
        return carWheelsService.getAllCarWheels();
    }
}