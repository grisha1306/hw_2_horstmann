package com.company.chapter1_task13;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        lottery();
    }

    public static void lottery () {
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> arrayResult = new ArrayList<>();
        for (int i = 0; i <= 48; i ++) {
            array.add(i+1);
        }
        for (int j = 0; j < 6; j++){
            int x = (int)(Math.random() * ((48-j) + 1));
            arrayResult.add(array.get(x));
            array.remove(x);
        }
        Collections.sort(arrayResult);
        System.out.println(arrayResult);
    }
}
