package org.practice.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] data = {3, 3, 3, 7, 8, 8, 9, 10, 10, 11};
        System.out.println("Original array : ");
        Arrays.stream(data).forEach(element -> System.out.print(element + " "));
        removeDuplicates(data);
        System.out.println();
        System.out.println("After removing duplicates : ");
        Arrays.stream(data).forEach(element -> System.out.print(element + " "));
    }

    private static void removeDuplicates(int[] data) {
        if (data.length == 0) return;

        int newSize = 1;
        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[i - 1]) {
                data[newSize] = data[i];
                newSize++;
            }
        }
        for (int i = newSize; i < data.length; i++) {
            data[i] = 0;
        }
    }
}
