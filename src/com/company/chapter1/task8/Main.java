package com.company.chapter1.task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String string = scanner.nextLine();
        printNonEmptySubstring(string);

    }

    private static void printNonEmptySubstring(String str) {

        for (int end = str.length(); end > 0; end--) {
            for (int start = 0; start < end; start++) {
                String result = str.substring(start, end);
                if(!result.isEmpty()) {
                    System.out.println(result);;
                }
            }
        }
    }

}
