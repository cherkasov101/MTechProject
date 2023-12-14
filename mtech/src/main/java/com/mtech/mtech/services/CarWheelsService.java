package com.mtech.mtech.services;

import com.mtech.mtech.models.Car;
import com.mtech.mtech.models.CarWheels;

public class CarWheelsService {
    
    private Car car;
    
    public CarWheelsService(Car car) {
        this.car = car;
    }
    
    public void addWheel(CarWheels wheel) {
        car.addWheel(wheel);
    }
    
    public void removeWheel(CarWheels wheel) {
        car.removeWheel(wheel);
    }
    
    public void replaceWheel(CarWheels oldWheel, CarWheels newWheel) {
        car.removeWheel(oldWheel);
        car.addWheel(newWheel);
    }
    
    public int getNumberOfWheels() {
        return car.getWheels().size();
    }
}