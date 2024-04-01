package com.sagar;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char character = input.next().trim().charAt(0);
        System.out.println(character);
        if(character >= 'a' && character <= 'z'){
            System.out.println("Lower Case");
        }
        else{
            System.out.println("Upper Case");
        }
    }
}
