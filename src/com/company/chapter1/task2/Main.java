package com.company.chapter1.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение угла: ");
        int angle = scan.nextInt();
        System.out.println(Math.floorMod(angle, 360));
        angle = angle % 360;
        angle = (angle + 360) % 360;
    }
}
