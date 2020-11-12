package com.w3resource.basic_part_I;

public class Exercise_11 {

    /*
       Write a Java program to print the area and perimeter of a circle. Go to the editor
       Test Data:
       Radius = 7.5
       Expected Output
       Perimeter is = 47.12388980384689
       Area is = 176.71458676442586
     */

    public static void main(String[] args) {
        double radius = 7.5;
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("area is: " + area);
        System.out.println("Perimeter is: " + perimeter);
    }
}
