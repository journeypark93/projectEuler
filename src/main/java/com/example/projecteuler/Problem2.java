package com.example.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {

    public static void main(String[] args){
        List<Integer> f = new ArrayList<>();
        f.add(1);
        f.add(2);

        int result = 2;
        int a = 0;

        while(a<4000000){
            a = f.get(f.size()-2) + f.get(f.size()-1);
            f.add(a);
            if (a%2==0) result+= a;
        }

        System.out.println(result);
    }
}
