package com.company.task1_11;

import java.util.Scanner;

public class Main1_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print text: ");
        String string = scanner.nextLine();

        char[] charArray = string.toCharArray();

        for (char c : charArray) {
            int val = (int) c;
            if (val > 255)
                System.out.println("not ASCII char " + c + " Unicode = " + val);
            else
                System.out.println("char is ASCII: " + c);
        }
    }
}
