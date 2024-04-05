package com.sagar;

public class FindingPositionInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int target = 9;
        int index = search(nums, target);
        System.out.println(index);
    }

    public static int search(int[] nums, int target){
        int start = 0;
        int end = 1;
        int mid;
        int n = 0;
        while(target >= nums[end]){
            start = end + 1;
            end = (int) (start + Math.pow(2, n) - 1);
            n++;
        }

        while(start <= end){
            // find middle element
            // if start + end exceeds the integer range in java then it will give error
            // int mid = (start + end) / 2;
            mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}
