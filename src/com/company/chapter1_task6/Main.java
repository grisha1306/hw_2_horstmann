package com.company.chapter1_task6;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scan.nextInt();
        System.out.println(factorial(x));
    }

    public static BigInteger factorial (int x) {
        BigInteger result = BigInteger.valueOf(1);

        for (int i = 2; i <= x; i++){
            BigInteger i1 = BigInteger.valueOf(i);
            result = result.multiply(i1);
        }

        return result;
    }
}
