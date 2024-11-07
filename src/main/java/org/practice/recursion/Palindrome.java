package org.practice.recursion;

public class Palindrome {

    public static void main(String[] args) {
        String s = "abba";
        System.out.println("Is "+ s + " a Palindorme? -> " + (isPalindrome(s,0,s.length()-1)?"YES":"NO"));
    }

    private static boolean isPalindrome(String s, int start, int end) {
        if(start>=end){
            return true;
        }
        return s.charAt(start)==s.charAt(end) &&
                isPalindrome(s,start+1,end-1);
    }

}
