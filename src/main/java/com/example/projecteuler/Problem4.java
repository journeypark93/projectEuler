package com.example.projecteuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem4 {
    public static void main(String[] args) {

        List<Integer> pals = new ArrayList<>();

        for (int x = 999; x >= 888; x--) {
            for (int i = 999; i >= 888; i--) {
                int num = i * x;
                int numLength = String.valueOf(num).length();
                String num2 = "";
                for (int j = numLength - 1; j >= 0; j--) {
                    num2 += (num % 10);
                    num /= 10;
                }

                if (num2.equals(String.valueOf(i * x))) {
                    pals.add(i * x);
                    break;
                }
            }
        }
        Collections.sort(pals);
        System.out.println(pals.get(pals.size() - 1));
    }
}
