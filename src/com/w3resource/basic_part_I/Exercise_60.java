package com.w3resource.basic_part_I;

import java.util.Scanner;

public class Exercise_60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sentence: ");
        String line = scanner.nextLine();
        String[] words = line.split(" ");
        System.out.println("Penultimate word: " + words[words.length-2]);
    }
}
