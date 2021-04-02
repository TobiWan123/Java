package com.company;

public class ECarFactory extends CarFactory{
    float newtonM;

    @Override
    public Car buildCar() {
        System.out.println("Building Electro Car.");
        // get random values for cars
        this.getRandom();
        // build car
        return new ECar(this.brand, this.model, "Electro", this.weight, this.range, this.newtonM);
    }

    @Override
    // random values
    public void getRandom() {
        super.getRandom();
        this.newtonM = (float) Math.random() * 1000 + 200;
    }
}
