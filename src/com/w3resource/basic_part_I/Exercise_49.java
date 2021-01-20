package com.w3resource.basic_part_I;

import java.util.Scanner;

public class Exercise_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = input.nextInt();
        System.out.println(number % 2 == 0 ? 1 : 0);
    }
}
