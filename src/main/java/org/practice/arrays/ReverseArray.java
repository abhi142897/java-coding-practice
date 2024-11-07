package org.practice.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] data = {10, 5, 8, 20, 3, 12, 7};
        System.out.println("before reverse");
        Arrays.stream(data).forEach(element -> System.out.print(element + " "));
        reverseArray(data);
        System.out.println();
        System.out.println("after reverse");
        Arrays.stream(data).forEach(element -> System.out.print(element + " "));
    }

    private static void reverseArray(int[] data) {
        int start = 0;
        int end = data.length - 1;
        while (start < end) {
            int temp = data[start];
            data[start] = data[end];
            data[end] = temp;
            start++;
            end--;
        }
    }
}
