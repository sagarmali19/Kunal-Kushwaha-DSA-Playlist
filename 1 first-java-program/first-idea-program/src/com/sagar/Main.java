package com.sagar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World !!");
        Scanner input = new Scanner(System.in);
        //System.out.println(input.nextInt());

        // Primitive data types - int, char, float, double, long
        // wrapper classes - Integer
        
        System.out.print("Please input your roll number : ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is : "+rollno);

        //Type casting
        int number = (int) (45.678f);
        System.out.println("Converted number is : "+number);

        //automatic type promotion in expression
        int a = 257;
        byte b = (byte)(a); //257 % 256 = 1

        byte a1 = 40;
        byte b1 = 50;
        byte c1 = 100;
        int d = a1 * b1 / c1; // d = 20;
        // Though 2000 exceeds byte range still it will treat it as integer as d has type integer

        //if loop
        if(true){
            System.out.println("Always True.");
        }

        //while loop
        int num1 = 1;
        while(num1 != 5){
            System.out.println(num1);
            num1++;
        }

        //for loop - initialization, condition, increment/decrement
        for(int count = 1; count != 5; count++){
            System.out.println(count);
        }
    }
}
