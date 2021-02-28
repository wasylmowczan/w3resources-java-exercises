package com.w3resource.collection.LinkedList;

import java.util.LinkedList;

public class Exercise_11 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        for (int i = 0; i < strings.size(); i++) {
            System.out.println("Element is : " + strings.get(i) + " with index: " + i);
        }
    }
}
