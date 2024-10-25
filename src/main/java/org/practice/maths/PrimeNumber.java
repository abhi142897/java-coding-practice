package org.practice.maths;

public class PrimeNumber {

    public static void main(String[] args) {
        int x = 67;
        System.out.println("Is " + x + " a prime number?" + (isPrime(x) ? " Yes" : " NO"));
    }

    private static boolean isPrime(int x) {
        if (x == 0) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    //more optimum solution
    // 1 is neither prime nor composite.
    private static boolean isPrimeOptimised(int x) {
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
