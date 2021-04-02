package com.company;

public class FCarFactory extends CarFactory{
    float ps;

    @Override
    public Car buildCar() {
        System.out.println("Building Fossil Car.");
        // get random values for cars
        this.getRandom();
        // build car
        return new FCar(this.brand, this.model, "Fossil", this.weight, this.range, this.ps);
    }

    @Override
    public void getRandom() {
        super.getRandom();
        this.ps = (float) Math.random() * 1000 + 200;
    }
}
