package com.sagar;

import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch (fruit){
            case "Mango":
                System.out.println("Mango");
                break;
            case "Apple":
                System.out.println("Apple");
                break;
            default:
                System.out.println("Unknown Fruit");
        }
    }
}
