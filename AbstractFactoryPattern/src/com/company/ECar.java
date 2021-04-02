package com.company;

public class ECar extends Car {
    // unique ECar value
    float newtonM;

    ECar(String brand, String model, String dTech, double weight, double range, float newtonM) {
        super(brand, model, dTech, weight, range);
        this.newtonM = newtonM;
    }

    @Override
    public float getPower() {
        return this.newtonM;
    }

    @Override
    public void drive(int nr) {
        System.out.println("ECar Nr." + nr + " is driving \n");
    }

}
