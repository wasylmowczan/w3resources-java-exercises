package com.w3resource.collection.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Exercise_15 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        Collections.swap(strings, 0, 1);
        System.out.println(strings);
    }
}
