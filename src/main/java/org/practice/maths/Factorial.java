package org.practice.maths;

public class Factorial {
    public static void main(String[] args) {
        int x = 6;
        System.out.println("Factorial of " + x + " is: " + getFactorial(x));
        System.out.println("Factorial of " + x + " using recursion is: " + getFactorialRecursion(x));
    }

    private static int getFactorial(int x) {
        int factorial = 1;
        for (int i = x; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    private static int getFactorialRecursion(int x){
        if(x==0){
            return 1;
        }
        return x*getFactorialRecursion(x-1);
    }
}
