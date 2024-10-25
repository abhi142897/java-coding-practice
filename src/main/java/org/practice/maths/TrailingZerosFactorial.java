package org.practice.maths;

//count trailing zeros in factorial
public class TrailingZerosFactorial {

    public static void main(String[] args) {
        int x = 251;
        System.out.println("Trailing zeros in factorial of " + x + "are -> " + getTrailingZeros(x));
    }

    private static int getTrailingZeros(int x) {
        int result = 0;
        for (int i = 5; i <= x; i = i * 5) {
            result = result + x / i;
        }
        return result;
    }
}
