package com.company.chapter1_task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = scan.nextInt();
        System.out.print("Введите второе число: ");
        int y = scan.nextInt();
        System.out.print("Введите третье число: ");
        int z = scan.nextInt();

        largest(x,y,z);

        System.out.println("Самое большое число: " + Math.max(x, Math.max(y,z)));
    }

    public static void largest (int x, int y, int z) {

        if ( x > y && x > z )
            System.out.println("Самое большое число: " + x);
        else if ( y > x && y > z)
            System.out.println("Самое большое число: " + y);
        else if ( z > x && z > y)
            System.out.println("Самое большое число: " + z);
    }
}
