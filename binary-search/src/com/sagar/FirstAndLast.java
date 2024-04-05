package com.sagar;

import java.util.Arrays;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 4, 4, 4, 7, 8};
        int target = 4;
        int[] position = firstAndLast(nums, target);
        System.out.println(Arrays.toString(position));
    }

    private static int[] firstAndLast(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while(nums[i] != target){
            i++;
        }

        while(nums[j] != target){
            j--;
        }

        return new int[] {i++, j++};
    }
}
