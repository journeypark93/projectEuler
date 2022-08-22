package com.example.projecteuler;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    public static void main(String[] args){

        System.out.println(Problem3.calPrime(600851475143L));
    }

    public static double calPrime(long num){

        long k = 2L;
        List<Long> primes = new ArrayList<>();
        double sqrtNum = Math.sqrt(num);
        while(k<=sqrtNum && k != 1){
            if (num % k == 0){
                num /= k;
                primes.add(k);
            } else {
                k++;
            }
        }

        return primes.get(primes.size()-1);
    }
}
