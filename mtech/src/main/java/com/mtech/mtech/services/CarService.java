package com.mtech.mtech.services;

import com.mtech.mtech.models.Car;
import com.mtech.mtech.repositories.CarRepository;

import java.util.List;
import java.util.Optional;

public class CarService {
    
    private CarRepository carRepository;
    
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }
    
    public void createCar(Car car) {
        carRepository.save(car);
    }
    
    public void updateCar(Car car) {
        carRepository.save(car);
    }
    
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
    
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
    
    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }
}