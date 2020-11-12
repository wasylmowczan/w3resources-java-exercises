package com.w3resource.basic_part_I;

import java.util.Scanner;

public class Exercise_12 {

    /*
    Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Provide first number: ");
        int number1 = sc.nextInt();
        System.out.println("Provide second number: ");
        int number2 = sc.nextInt();
        System.out.println("Provide third number: ");
        int number3 = sc.nextInt();
        int average = (number1 + number2 + number3) / 3;
        System.out.println("The average number is: " + "\n" + average);
    }

}
