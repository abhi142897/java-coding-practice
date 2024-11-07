package org.practice.arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] data = {10, 5, 8, 20, 3, 12, 7};
        System.out.println(largestElement(data));
        System.out.println(secondLargest(data));
    }

    private static int secondLargest(int[] data) {
        int secondLargestIdx = -1;
        int largestIdx = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] > data[largestIdx]) {
                secondLargestIdx = largestIdx;
                largestIdx = i;
            } else if (data[i] != data[largestIdx]) {
                if (secondLargestIdx == -1 || data[i] > data[secondLargestIdx]) {
                    secondLargestIdx = i;
                }
            }
        }
        return data[secondLargestIdx];
    }

    private static int largestElement(int[] data) {
        int ansIdx = 0;
        for (int i = 1; i < data.length; i++) {
            if (data[i] > data[ansIdx]) {
                ansIdx = i;
            }
        }

        return data[ansIdx];
    }
}
