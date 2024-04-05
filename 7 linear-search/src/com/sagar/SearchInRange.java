package com.sagar;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23, 56, 78, 90};
        int startIndex = 1;
        int endIndex = 2;
        int target = 78;
        int index = searchInRange(nums, startIndex, endIndex, target);
        System.out.println(index);
    }

    private static int searchInRange(int[] nums, int startIndex, int endIndex, int target) {
        if (startIndex < 0 || endIndex < 0 || endIndex > nums.length) {
            return -1;
        }

        for (int i = startIndex; i <= endIndex; i++) {
            if (nums[i] == target){
                return i;
            }
        }

        return -1;
    }
}
