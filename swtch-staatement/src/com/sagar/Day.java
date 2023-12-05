package com.sagar;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();

        String shirtColor = input.next();

        // new enhanced switch statement
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Unknown");
        }

        // nested switch statement
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                switch(shirtColor){
                    case "Red":
                        System.out.println("Red shirt");
                        break;
                    case "Yellow":
                        System.out.println("Yellow Shirt");
                        break;
                    default:
                        System.out.println("Green Shirt");
                }
                break;
            default:
                System.out.println("Other days of week");
        }
    }
}
