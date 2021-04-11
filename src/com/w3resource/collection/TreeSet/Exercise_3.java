package com.w3resource.collection.TreeSet;

import java.util.TreeSet;

public class Exercise_3 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");

        TreeSet<String> newColors = new TreeSet<>();
        colors.add("Yellow");
        colors.add("Pink");
        colors.add("Black");

        newColors.addAll(colors);

        System.out.println(newColors);
    }
}
