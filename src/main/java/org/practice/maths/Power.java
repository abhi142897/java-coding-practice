package org.practice.maths;

//input: x=2 y=3    output: 8 (2 raise to 3)

public class Power {

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        System.out.println(getPower(x, y));
    }

    private static int getPower(int x, int y) {
        int power = 1;
        for (int i = 1; i <= y; i++) {
            power = power * x;
        }
        return power;
    }

}
