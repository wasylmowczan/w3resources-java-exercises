package com.w3resource.collection.LinkedList;

import java.util.LinkedList;

public class Exercise_10 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        String first = strings.getFirst();
        System.out.println("First element: " + first);
        String last = strings.getLast();
        System.out.println("Last element: " + last);
    }
}
