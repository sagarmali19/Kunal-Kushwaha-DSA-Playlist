package com.sagar;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);
    }

    static void swap(int a, int b){
        //swap the numbers
        int temp = a;
        a = b;
        b = temp;
    }
}
