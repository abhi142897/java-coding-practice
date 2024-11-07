package org.practice.recursion;




public class PrintReverseOrder {

    public static void main(String[] args) {
        printReverseOrder(5);
        System.out.println();
        printNormalOrder(5);
    }

    //input: 5  output: 1,2,3,4,5
    private static void printNormalOrder(int n) {
        if(n==0){
            return;
        }
        printNormalOrder(n-1);
        System.out.print(n + " ");
    }

    //input: 5  output: 5,4,3,2,1
    private static void printReverseOrder(int n) {

        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printReverseOrder(n-1);
    }

}

