package com.company.chapter1.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scan.nextInt();
        double y = (double)1/x;
        System.out.println(Integer.toString(x,2));
        System.out.println(Integer.toString(x,8));
        System.out.println(Integer.toString(x,16));
        System.out.println(Double.toString(y));
    }
}
