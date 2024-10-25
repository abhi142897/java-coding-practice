package org.practice.maths;

public class PrimeFactors {

    public static void main(String[] args) {
        printPrimeFactors(108);
    }

    private static void printPrimeFactors(int number){
        while(number%2==0){
            System.out.print(2 + " ");
            number = number/2;
        }
        while(number%3==0){
            System.out.print(3 + " ");
            number = number/3;
        }
        for (int i=5;i*i<=number;i=i+6){
            while (number%i==0){
                System.out.print(i + " ");
                number = number/i;
            }
            while (number%(i+2)==0){
                System.out.print(i + " ");
                number = number/i+2;
            }
        }
        if(number>3){
            System.out.print(number + " ");
        }

    }
}
