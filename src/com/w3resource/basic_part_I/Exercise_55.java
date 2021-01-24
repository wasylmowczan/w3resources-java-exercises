package com.w3resource.basic_part_I;

import java.util.Scanner;

public class Exercise_55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = in.nextInt();
        int sec = seconds % 60;
        int hours = seconds / 3600;
        int minutes = hours % 60;
        System.out.print(hours + ":" + minutes + ":" + sec);
        System.out.print("\n");
    }
}
