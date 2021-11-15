package com.company.chapter2_task9;

public class Car {
    private double x;
    private double fuelLevel;
    private double fuelEfficiency;

    public Car (double fuelEfficiency, double fuelLevel) {
        this.x = 0;
        this.fuelLevel = fuelLevel;
        this.fuelEfficiency = fuelEfficiency;
    }

    public void setDrive (double x) {
        if ( this.fuelLevel <= 0 )
            return;

        this.x += x;
        this.fuelLevel -= x/this.fuelEfficiency;
    }

    public void addGas (double gas) {
        this.fuelLevel += gas;
    }

    public double getDistance () {
        return Math.abs(this.x);
    }

    public double getFuelLevel () {
        return this.fuelLevel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "x=" + x +
                ", fuelLevel=" + fuelLevel +
                ", fuelEfficiency=" + fuelEfficiency +
                '}';
    }
}
