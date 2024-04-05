package com.sagar;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] nums = {5, 8, 10, 12, 15};
        int target = 11;
        int index = floorOfNumber(nums, target);
        System.out.println(index);
    }

    static int floorOfNumber(int[] nums, int target){
        if(target < nums[0]){
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
        // solution for it : start end target -> and that is what we need number which is < target
        // as if we need equal to element it is caught already by BS.
        return end;
    }
}
