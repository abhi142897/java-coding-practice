package org.practice.maths;

import java.util.ArrayList;
import java.util.List;

public class AllDivisors {

    public static void main(String[] args) {
        printAllDivisors(50);
    }

    private static void printAllDivisors(int number) {
        int i;
        List<Integer> divisors = new ArrayList<>();
        for (i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                divisors.add(i);
                if (i != number / i) {
                    divisors.add(number/i);
                }
            }
        }
        divisors.stream().sorted().forEach(divisor -> System.out.print(divisor + " "));
    }
}

