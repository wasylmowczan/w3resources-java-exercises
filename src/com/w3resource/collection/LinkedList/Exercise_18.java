package com.w3resource.collection.LinkedList;

import java.util.LinkedList;

public class Exercise_18 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        LinkedList<String> copyOfStrings = new LinkedList<String>();
        copyOfStrings = (LinkedList)strings.clone();
        System.out.println(copyOfStrings);
    }
}
