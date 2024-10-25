package org.practice.maths;

public class Palindrome {

    public static void main(String[] args) {
        int x = 1234;
        System.out.println("Is " + x + " a Palindrome? -> " + isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int temp = x;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        return x==reverse;
    }
}
