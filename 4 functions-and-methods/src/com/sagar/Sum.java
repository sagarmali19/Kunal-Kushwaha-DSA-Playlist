package com.sagar;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        int sum1 = sum1();
        System.out.println(sum1);
        int ans = sum3(10,20);
        System.out.println(ans);
    }

    public static void sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = input.nextInt();
        System.out.println("Enter second number : ");
        int num2 = input.nextInt();
        System.out.println("Sum is : ");
        int sum = num1 + num2;
        System.out.println(sum);
    }

    public static int sum1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = input.nextInt();
        System.out.println("Enter second number : ");
        int num2 = input.nextInt();
        System.out.println("Sum is : ");
        int sum = num1 + num2;
        return sum;
    }

    // When do return, after it nothing will be executed

    public static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }
}
