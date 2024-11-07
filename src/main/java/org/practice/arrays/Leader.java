package org.practice.arrays;

    //leader = element for which there is no other element is grater on its right side.

public class Leader {
    public static void main(String[] args) {
        int[] data = {7, 10, 4, 10, 6, 5, 2};
        getLeaders(data);
    }

    private static void getLeaders(int[] data) {
        int current_leader = data[data.length-1];  //last element is always a leader
        System.out.print(current_leader + " ");
        for(int i = data.length-2;i>=0;i--){
            if(current_leader<data[i]){
                current_leader = data[i];
                System.out.print(current_leader + " ");
            }
        }
    }
}
