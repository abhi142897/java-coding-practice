package org.practice.maths;

/*
    In this program we are going to find GCD using Euclidean Algorithm
    It’s based on the principle that the GCD of two numbers also divides their difference.

 */


public class Gcd {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        System.out.println("GCD of " + a + " and " + b + " is -> " + getGcdUsingEuclidean(a, b));
    }

    private static int getGcdUsingBasicApproach(int a, int b) {
        int gcd = Math.min(a, b);
        while (gcd > 0) {
            if (a % gcd == 0 && b % gcd == 0) {
                break;
            }
            gcd--;
        }
        return gcd;
    }

    private static int getGcdUsingBasicEuclidean(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    //Optimum Euclidean approach
    private static int getGcdUsingEuclidean(int a, int b) {
        while (b != 0) {
            int r = a % b; // Calculate remainder
            a = b;         // Update a
            b = r;         // Update b
        }
        return a; // Last non-zero remainder is the GCD
    }
}

