package com.sagar;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] nums = {23, 21, 2, 1};
        int target = 1;
        int index = modifiedBS(nums, target);
        System.out.println(index);
    }

    static int modifiedBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            // find middle element
            // if start + end exceeds the integer range in java then it will give error
            // int mid = (start + end) / 2;
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else if(target > arr[mid]){
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}




