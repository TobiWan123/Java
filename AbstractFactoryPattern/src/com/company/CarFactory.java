package com.company;

public abstract class CarFactory {
    String[] brands = {"BMW", "Audi", "Tesla", "NIO", "Volkswagen"};
    String[] models = {"Model 1", "Model 2", "Model 3"};
    double weight, range;
    String brand, model;

    public abstract Car buildCar();

    public void getRandom(){
        this.brand = brands[(int) Math.ceil(Math.random() * brands.length - 1)];
        this.model = models[(int) Math.ceil(Math.random() * models.length - 1)];
        this.weight = Math.random() * 2000 + 1000;
        this.range = Math.random() * 1000 + 200;
    }
}
