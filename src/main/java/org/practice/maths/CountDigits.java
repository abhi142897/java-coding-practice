package org.practice.maths;

//Write functions which will take integer x as an argument and returns number of digits in the number.

public class CountDigits {

    public static void main(String[] args) {
        System.out.println("Count by converting to String: " + countUsingString(38));
        System.out.println("Count by dividing: " + countByDivision(38));

    }

    public static int countUsingString(int x) {
        String target = String.valueOf(x);
        return target.length();
    }

    public static int countByDivision(int x) {
        int count = 0;
        while (x > 0) {
            count++;
            x = x / 10;
        }
        return count;
    }
}
