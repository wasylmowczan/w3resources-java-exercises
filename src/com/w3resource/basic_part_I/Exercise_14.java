package com.w3resource.basic_part_I;

public class Exercise_14 {
    /*
    Write a Java program to print an American flag on the screen.
     */

    public static void main(String[] args) {
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");

        // Second example

        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}
