package com.company.task3_1_2;

public class Main3_1_2 {

    public static void main(String[] args) {

        Employee one = new Employee("Petya", 5000);
        Employee two = new Employee("Vanya", 4000);
        Employee three = new Employee("Vasya", 2000);

        Measurable[] objects = {one, two, three};

        System.out.println("The average salary: " + average(objects));

        Measurable largeSalary = largest(objects);

        if ( largeSalary instanceof Employee ) {
            System.out.println("Largest salary is: " + ((Employee) largeSalary).getName() +
                    " with " + ((Employee) largeSalary).getSalary() + " salary");
        }
        else System.out.println("Error");
    }

    public static double average(Measurable[] objects) {
        double sum = 0;
        for (int i = 0; i < objects.length; i++) {
            sum += objects[i].getMeasure();
        }
        return sum / (double) objects.length;
    }


    public static Measurable largest(Measurable[] objects) {
        Measurable max = objects[0];
        for (Measurable measurable : objects) {
            if (max.getMeasure() <= measurable.getMeasure()) {
                max = measurable;
            }
        }
        return max;
    }
}
