package com.sagar;

import java.util.Scanner;

public class Occurances {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number here : ");
        int number = input.nextInt();
        System.out.println("Enter number for occurances : ");
        int num_occur = input.nextInt();
        int count = 0;
        int digit;
        while(number != 0){
            digit = number % 10;
            if(digit == num_occur){
                count++;
            }
            number = number / 10;
        }
        System.out.println("Occured for : " + count);

    }
}
