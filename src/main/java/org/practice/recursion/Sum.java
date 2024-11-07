package org.practice.recursion;

public class Sum {

    public static void main(String[] args) {
        System.out.println(getSum(10));
    }

    //input: 10     output: 1+2+3+....+10=255
    private static int getSum(int n) {
        if(n==0){
            return 0;
        }
        return n + getSum(n-1);
    }

}
