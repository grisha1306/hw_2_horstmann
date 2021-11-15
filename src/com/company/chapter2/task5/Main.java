package com.company.chapter2.task5;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(3,4).translate(-1,-1).scale(0.5);
        System.out.println(point);
    }
}
