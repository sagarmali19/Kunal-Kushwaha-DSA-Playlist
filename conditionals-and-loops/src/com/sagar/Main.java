package com.sagar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // if conditinal
        int salary = 10000;
        if(salary <= 10000){
            System.out.println("Poor class");
        }
        else if(salary > 10000 && salary < 15000 ){
            System.out.println("Middle class");
        }
        else{
            System.out.println("Rich");
        }

        //for loop
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.print(i+" ");
        }

        //while loop
        int num = 1;
        System.out.println("");
        while(num <= 20){
            System.out.print(num+" ");
            num++;
        }

        //do while loop
        int number = 1;
        System.out.println("");
        do{
            System.out.print(number+" ");
            number++;
        }while(number<=20);

        //it will run atleast once
        int number1 = 2;
        System.out.println("");
        do{
            System.out.println("Hello World");
        }while(number1 != 2);
        //println will move cursor to next line after it
    }
}
