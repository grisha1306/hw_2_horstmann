package com.company.chapter1.task9;

public class Main {
    public static void main(String[] args) {
        String string = "Hello";
        String string1 = "Hello";

        String string2 = "Hel";
        String string3 = string2.substring(0,3);

        String string4 = new String("Hello");

        System.out.println(string1.equals(string));
        System.out.println(string4.equals(string));
        System.out.println(string1 == string);
        System.out.println(string4 == string);
        System.out.println(string2 == string3);
        System.out.println(string2.equals(string3));
    }
}
