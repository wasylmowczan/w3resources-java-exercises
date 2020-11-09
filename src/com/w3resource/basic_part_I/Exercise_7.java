package com.w3resource.basic_part_I;

import java.util.Scanner;

public class Exercise_7 {

    /*
    Write a Java program that takes a number as input and prints its multiplication table upto 10
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = input.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
