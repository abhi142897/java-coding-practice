package org.practice.maths;

/*
    In this program we are going to find LCM
    we first find GCD using Euclidean Algorithm and then we can calculate LCM using below formula
    a*b = gcd(a,b)*lcm(a,b)
    hence, lcm(a,b) = a*b/gcd(a,b)
    It’s based on the principle that the GCD of two numbers also divides their difference.

 */

public class Lcm {

    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        System.out.println("LCM of " + a + " and " + b + " is -> " + getLcm(a, b));
    }


    private static int getGcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    private static int getLcm(int a, int b) {
        return a * b / getGcd(a, b);
    }
}
