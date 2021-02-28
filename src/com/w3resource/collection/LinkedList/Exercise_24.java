package com.w3resource.collection.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Exercise_24 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        LinkedList<String> strings2 = new LinkedList<String>();
        strings2.add("First");
        strings2.add("Second");
        strings2.add("Third");

        LinkedList<String> result = new LinkedList<String>();
        for (String s : strings) {
            result.add(strings2.contains(s) ? "Yes" : "No");
        }

        System.out.println(result);
    }
}
