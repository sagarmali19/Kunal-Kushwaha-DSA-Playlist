package com.sagar;

import java.util.Arrays;

public class FirstAndLastOptimized {
    public static void main(String[] args) {
        int[] nums = {1, 4, 4, 4, 5};
        int target = 4;
        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        int firstPosition = search(nums, target, true);
        int lastPosition = search(nums, target, false);

        ans[0] = firstPosition;
        ans[1] = lastPosition;

        return ans;
    }


    public static int search(int[] nums, int target, boolean isFirstIndex){
        int start = 0;
        int end = nums.length - 1;
        int mid;
        int ans = -1;

        while(start <= end){
            mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                // potentially be the ans
                ans = mid;
                if(isFirstIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
