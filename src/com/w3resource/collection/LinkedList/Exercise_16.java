package com.w3resource.collection.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Exercise_16 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        Collections.shuffle(strings);
        System.out.println(strings);
    }
}
