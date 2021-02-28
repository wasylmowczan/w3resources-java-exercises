package com.w3resource.collection.LinkedList;

import java.util.LinkedList;

public class Exercise_12 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        strings.remove("First");
        //or
        strings.remove(1);
        //or
        strings.removeLast();

        System.out.println(strings);
    }
}
