package com.company.task1_6;

import java.math.BigInteger;
import java.util.Scanner;

public class Main1_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scan.nextInt();
        System.out.println(factorial(x));
    }

    public static BigInteger factorial (int x) {
        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= x; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
