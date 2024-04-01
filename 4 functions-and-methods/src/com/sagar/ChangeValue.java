package com.sagar;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr1 = {1,4,5,6};
        change(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void change(int[] num){
        num[0] = 99;
    }



}
