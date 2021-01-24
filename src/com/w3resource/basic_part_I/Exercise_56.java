package com.w3resource.basic_part_I;

import java.util.Scanner;

public class Exercise_56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input x: ");
        int x = input.nextInt();
        System.out.println("Input y: ");
        int y = input.nextInt();
        System.out.println("Input p: ");
        int p = input.nextInt();
        int counter = 0;
        for (int i = x; i < +y; i++) {
            if (i % p == 0)
                counter++;
        }

        System.out.println(counter);
    }
}
