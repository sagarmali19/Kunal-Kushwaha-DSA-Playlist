package com.sagar;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 67, 78};
        int index = linearSearch(nums, 45);
        System.out.println(index);
    }

    public static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
