package com.w3resource.collection.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Exercise_17 {
    public static void main(String[] args) {
        LinkedList<String> strings1 = new LinkedList<String>();
        strings1.add("First");
        strings1.add("Second");
        strings1.add("Third");

        LinkedList<String> strings2 = new LinkedList<String>();
        strings2.add("Fourth");
        strings2.add("Fifth");
        strings2.add("Sixth");

        LinkedList<String> joinedList = new LinkedList<String>();
        joinedList.addAll(strings1);
        joinedList.addAll(strings2);
        System.out.println(joinedList);
    }
}
