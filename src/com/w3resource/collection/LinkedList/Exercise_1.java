package com.w3resource.collection.LinkedList;

import java.util.LinkedList;

public class Exercise_1 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        strings.addLast("Last");

        System.out.println(strings);
    }
}
