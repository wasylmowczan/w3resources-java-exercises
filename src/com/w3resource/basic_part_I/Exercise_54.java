package com.w3resource.basic_part_I;

import java.util.Scanner;

public class Exercise_54 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int x = in.nextInt();
        System.out.print("Input the second number: ");
        int y = in.nextInt();
        System.out.print("Input the third number : ");
        int z = in.nextInt();
        System.out.print("The result is: "+test_last_digit(x, y, z));
        System.out.print("\n");
    }

    public static boolean test_last_digit(int p, int q, int r)
    {
        return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
    }
}