package com.w3resource.basic_part_I;

public class Exercise_15 {

    /*
    Write a Java program to swap two variables.
     */

    public static void main(String[] args) {
        int a,b, tmp;
        a = 10;
        b = 20;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("After swapping : a, b = "+a+", "+ + b);
    }
}
