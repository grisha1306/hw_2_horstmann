package com.company.chapter3.task1and2;

public class Employee implements Measurable{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
