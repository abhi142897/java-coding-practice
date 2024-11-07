package org.practice.arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] data = {10, 5, 0, 0, 8, 20, 0, 3, 12, 7};
        System.out.println("original Array : ");
        Arrays.stream(data).forEach(element -> System.out.print(element + " "));
        moveZerosToEnd(data);
        System.out.println();
        System.out.println("after moving zeros to end : ");
        Arrays.stream(data).forEach(element -> System.out.print(element + " "));
    }

    private static void moveZerosToEnd(int[] data) {
        int count = 0;
        int temp = 0;
        for(int i=0;i<data.length;i++){
            if(data[i]!=0){
                temp = data[i];
                data[i] = data[count];
                data[count] = temp;
                count++;
            }
        }
    }
}
