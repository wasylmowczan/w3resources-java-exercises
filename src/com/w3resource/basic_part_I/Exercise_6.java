package com.w3resource.basic_part_I;

import java.util.Scanner;

public class Exercise_6 {

    /*
     Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter first number:");
        int num2 = input.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + num1+num2);
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " x " + num2 + " = " + num1*num2);
        System.out.println(num1 + " / " + num2 + " = " + num1/num2);
        System.out.println(num1 + " mod " + num2 + " = " + num1%num2);
    }
}
