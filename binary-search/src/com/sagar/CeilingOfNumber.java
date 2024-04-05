package com.sagar;

public class CeilingOfNumber {
    // ceiling of number : smallest number that is equal to or greater that the number
    public static void main(String[] args) {
        int[] nums = {13, 14, 15, 17, 18, 19};
        int target = 15;
        int index = ceilingOfNumber(nums, target);
        System.out.println(index);
    }

    static int ceilingOfNumber(int[] nums, int target){
        if(target > nums[nums.length - 1]){
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        int mid;

        while(start <= end){
            mid = start + (end - start) / 2;

            if(nums[mid] > target){
                end = mid - 1;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else {
                // if target = element is found
                return mid;
            }
        }
        // solution for it : end target start -> and that is what we need number which is > target
        // as if we need equal to element it is caught already by BS.
        return start;
    }
}
