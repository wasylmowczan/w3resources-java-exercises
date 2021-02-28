package com.w3resource.collection.LinkedList;

import java.util.LinkedList;

public class Exercise_22 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        if (strings.contains("First")) {
            System.out.println("Element 'First' exist in the list");
        }
        else {
            System.out.println("Element 'First' doesn't exist in the list");
        }
    }
}
