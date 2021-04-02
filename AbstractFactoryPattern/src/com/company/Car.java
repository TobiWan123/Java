package com.company;

public abstract class Car implements DriveAble{
    String brand;
    String model;
    double weight;
    double range;
    String dTech;

    Car(String brand, String model, String dTech, double weight, double range){
        this.brand = brand;
        this.model = model;
        this.dTech = dTech;
        this.weight = weight;
        this.range = range;
    }

    public abstract float getPower();
}
