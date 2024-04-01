package com.sagar;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to reverse : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int reverse_number = 0;
        while(number > 0){
            int rem = number % 10;
            number = number / 10;
            reverse_number = rem + reverse_number * 10;
        }
        System.out.println("Reverse number is : " + reverse_number);
    }
}
