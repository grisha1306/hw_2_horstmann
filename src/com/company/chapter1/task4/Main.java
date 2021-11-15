package com.company.chapter1.task4;

public class Main {
    public static void main(String[] args) {
        double v = Math.nextUp(Double.MAX_VALUE);
        System.out.println(v);
        System.out.println("MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("MIN_VALUE: " + Double.MIN_VALUE);
        System.out.println(Math.nextUp(0.0));
        System.out.println(Math.nextUp(-1.0));
    }
}
