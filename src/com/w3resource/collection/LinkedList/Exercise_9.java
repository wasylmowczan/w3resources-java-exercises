package com.w3resource.collection.LinkedList;

import java.util.LinkedList;

public class Exercise_9 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        strings.add(2, "Inserted element");
        System.out.println(strings);

        //Or

        LinkedList <String> strings2 = new LinkedList<String>();
        strings2.add("New_1");
        strings2.add("New_2");

        strings.addAll(1, strings2);
        System.out.println(strings);
    }
}
