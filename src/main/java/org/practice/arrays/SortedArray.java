package org.practice.arrays;

public class SortedArray {

    public static void main(String[] args) {
        int[] data = {3, 5, 5, 8, 20};
        System.out.println(isSorted(data));
    }

    private static boolean isSorted(int[] data) {
        int smallest =0;
        for(int i=1;i<data.length;i++){
            if(data[smallest]>data[i]){
                return false;
            }
        }
        return true;
    }

}
