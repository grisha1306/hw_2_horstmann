package com.company.task1_2;

import java.util.Scanner;

public class Main1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите значение угла: ");
        int angle = scan.nextInt();
        System.out.println(Math.floorMod(angle, 360));
        angle = angle % 360;
        angle = (angle + 360) % 360;
    }
}
