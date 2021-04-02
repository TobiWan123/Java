package com.company;

public class FCar extends Car{
    // unique FCar value
    float ps;

    FCar(String brand, String model, String dTech, double weight, double range, float ps) {
        super(brand, model, dTech, weight, range);
        this.ps = ps;
    }

    @Override
    public float getPower() {
        return this.ps;
    }

    @Override
    public void drive(int nr) {
        System.out.println("FCar Nr." + nr + " is driving. \n");
    }
}
