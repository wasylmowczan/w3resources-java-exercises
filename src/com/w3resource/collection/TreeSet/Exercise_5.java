package com.w3resource.collection.TreeSet;

import java.util.TreeSet;

public class Exercise_5 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");

        String first = colors.first();
        String last = colors.last();
        System.out.println("First color is: " + first);
        System.out.println("Last color is: " + last);
    }
}
