package com.w3resource.basic_part_I;

import java.util.Scanner;

public class Exercise_5 {

    /*
    Write a Java program that takes two numbers as input and display the product of two numbers.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();

        System.out.println(a + " x " + b + " = " + a*b);
    }
}
