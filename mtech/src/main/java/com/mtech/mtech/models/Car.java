package com.mtech.mtech.models;

import java.util.ArrayList;
import java.util.List;

public class Car {
    
    private Long id;
    private String name;
    private List<CarBody> carBodies;
    private List<CarWheels> carWheels;
    
    public Car() {
        this.id = null;
        this.name = "";
        this.carBodies = new ArrayList<>();
        this.carWheels = new ArrayList<>();
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public List<CarBody> getCarBodies() {
        return carBodies;
    }

    public void setCarBodies(List<CarBody> carBodies) {
        this.carBodies = carBodies;
    }
    
    public List<CarWheels> getCarWheels() {
        return carWheels;
    }

    public void setCarWheels(List<CarWheels> carWheels) {
        this.carWheels = carWheels;
    }
}