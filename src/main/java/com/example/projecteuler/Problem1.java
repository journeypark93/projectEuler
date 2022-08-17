package com.example.projecteuler;


public class Problem1 {

    public static void main(String[] args) {

        int result = 0;
        int num = 1000;
        for (int i = 0; i < num; i++) {
            if (i % 3 == 0) {
                result += i;
            } else if (i % 5 == 0) {
                result += i;
            }
        }

        System.out.println(result);
    }
}
