package com.w3resource.collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Exercise_4 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        Iterator p = strings.descendingIterator();

        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}
