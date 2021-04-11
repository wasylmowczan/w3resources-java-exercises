package com.w3resource.collection.TreeSet;

import java.util.TreeSet;

public class Exercise_2 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");

        for (String color : colors) {
            System.out.println(color);
        }
    }
}
