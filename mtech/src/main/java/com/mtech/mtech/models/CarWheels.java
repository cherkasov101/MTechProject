package com.mtech.mtech.models;

public class CarWheels {
    
    private Long id;
    private String brand;
    private int size;
    
    public CarWheels() {
        this.id = null;
        this.brand = "";
        this.size = 0;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}