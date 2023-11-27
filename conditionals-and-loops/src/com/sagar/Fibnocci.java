package com.sagar;

import java.util.Scanner;

public class Fibnocci {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int result = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i <=n; i++) {
            System.out.print(result+" ");
            result = a + b;
            a = b;
            b = result;
        }

    }

}
