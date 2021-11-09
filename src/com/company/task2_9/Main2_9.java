package com.company.task2_9;

public class Main2_9 {
    public static void main(String[] args) {
        Car car = new Car(1,50);
        System.out.println(car);
        car.setDrive(5);
        System.out.println(car.getFuelLevel());
        car.addGas(100);
        System.out.println(car.getFuelLevel());
        car.setDrive(5);
        System.out.println(car.getFuelLevel());
    }
}
