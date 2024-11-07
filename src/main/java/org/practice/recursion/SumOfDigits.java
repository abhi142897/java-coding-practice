package org.practice.recursion;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(getSumOfDigits(8755));
        System.out.println(getSumOfDigitsIterative(8755));
    }

    private static int getSumOfDigitsIterative(int n) {
        int ans = 0;
        while(n>0){
            ans = ans + n%10;
            n = n/10;
        }
        return ans;
    }

    private static int getSumOfDigits(int n) {
        if(n<=0){
            return 0;
        }
        return n%10 + getSumOfDigits(n/10);
    }


}
