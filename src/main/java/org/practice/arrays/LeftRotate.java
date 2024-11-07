package org.practice.arrays;

import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] data = {10, 5, 8, 20, 3, 12, 7};
        System.out.println("Original array : ");
        Arrays.stream(data).forEach(element -> System.out.print(element + " "));
        leftRotateByOne(data);
        System.out.println();
        System.out.println("After left rotation by one : ");
        Arrays.stream(data).forEach(element -> System.out.print(element + " "));
    }

    private static void leftRotateByOne(int[] data) {
        int temp = data[0];
        for(int i=1;i<data.length;i++){
            data[i-1] = data[i];
        }
        data[data.length-1] = temp;
    }
}
