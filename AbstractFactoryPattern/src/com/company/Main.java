package com.company;
import java.util.*;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        CarFactory FactoryF  = new FCarFactory();
        CarFactory FactoryE  = new ECarFactory();

        System.out.println("----------Building random Cars---------");

        for(int i = 0; i < 10; i++){
            if(Math.random() * 2 > 1){
                cars.add(FactoryE.buildCar());
            }
            else{
                cars.add(FactoryF.buildCar());
            }
        }

        int action;
        boolean end = false;

        while(true){
            System.out.println("1. Show Cars | 2. build ECar | 3. build FCar | 4. drive rand() Car | 5. end program\n");
            action = scan.nextInt();
            switch (action){
                case 1: showCars(cars); break;
                case 2: cars.add(FactoryE.buildCar()); break;
                case 3: cars.add(FactoryF.buildCar()); break;
                case 4: driveRandom(cars); break;
                case 5: end = true ; break;
                default: System.out.println("Wrong Input\n"); break;
            }

            if(end) break;
        }

        System.out.println("End of program....");

        return;
    }

    public static void showCars(ArrayList<Car> cars){
        int i = 1;
        for (Car c : cars){
            System.out.println("Nr." + i + ", Brand: " + c.brand + ", Model: " + c.model + ", Technology: " + c.dTech);
            System.out.printf("Weight(Kg): %.2f", c.weight);
            System.out.printf(", Range(KM): %.2f", c.range);
            System.out.printf(", Power(PS/NewtonM): %.2f \n\n", c.getPower());
            i++;
        }
    }

    public static void driveRandom(ArrayList<Car> cars) {
        int nr = (int) Math.ceil(Math.random() * cars.size() - 1);
        cars.get(nr).drive(nr);
    }

}
