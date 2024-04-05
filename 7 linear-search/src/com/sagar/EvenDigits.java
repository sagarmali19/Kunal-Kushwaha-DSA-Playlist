package com.sagar;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {-23, 0, 789, 1234};
        System.out.println(finNumbers(nums));
    }

    // first approach : count the number of digits
    // convert to the string : then str.length
    static int finNumbers(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int digits = 0;
            int number = nums[i];
            if(number < 0){
                number = number * -1;
            }
            if (number == 0) {
                digits++;
            }
            // Counting the digits in the number
            // Approach 1

//            while(number > 0){
//                digits++;
//                number = number / 10;
//            }

            // Approach 2
            digits = (int)(Math.log10(number)) + 1;

            if(digits % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
