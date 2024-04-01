package com.sagar;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Operations to be performed : ");
        Scanner input = new Scanner(System.in);
        char op = input.next().trim().charAt(0);
        int ans = 0;
        while(true){
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers : ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 - num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                System.out.println("Answer is :" + ans );
            }
            else if(op == 'x' || op == 'X'){
                System.out.println("Calculator ended");
                break;
            }
            else {
                System.out.println("Invalid application.");
            }
        }
    }
}
