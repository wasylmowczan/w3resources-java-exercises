package com.w3resource.basic_part_I;

import java.util.Scanner;

public class Exercise_51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number (string): ");
        String stringNumber = scanner.nextLine();

        int number = Integer.parseInt(stringNumber);
        System.out.println("The integer value is: " + number);
    }
}
