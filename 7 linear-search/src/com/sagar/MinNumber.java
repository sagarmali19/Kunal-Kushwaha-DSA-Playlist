package com.sagar;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, -7, 9};
        int min = minNumber(arr);
        System.out.println(min);
    }

    private static int minNumber(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
