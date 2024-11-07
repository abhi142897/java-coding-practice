package org.practice.maths;

import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        //printPrimeNumbers(10);
        printPrimeNumbersOptimized(10);
    }

    //sieve of eratosthenes
    private static void printPrimeNumbersOptimized(int n) {
        boolean primeArr[] = new boolean[n + 1];
        Arrays.fill(primeArr, 0, n + 1, true);
        for (int i = 2; i <= n; i++) {
            if (primeArr[i]) {
                System.out.print(i + " ");
                for (int j = i * i; j <= n; j = j + i) {
                    primeArr[j]=false;
                }
            }
        }
    }

    private static void printPrimeNumbers(int n) {

        for (int i = 0; i < n; i++) {
            if (i < n && isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    private static boolean isPrime(int x) {
        if (x == 0 || x == 1) return false;
        if (x == 2 || x == 3) return true;
        if (x % 2 == 0 || x % 3 == 0) return false;
        for (int i = 5; i * i <= x; i = i + 6) {
            if (x % i == 0 || x % i + 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
