package com.w3resource.collection.LinkedList;

import java.util.LinkedList;

public class Exercise_21 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        String s = strings.peekLast();
        System.out.println(s);
    }
}
