package com.w3resource.collection.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Exercise_4 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");

        Iterator it = colors.descendingIterator();
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
