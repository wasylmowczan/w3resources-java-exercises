package com.w3resource.collection.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exercise_23 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        List<String> list = new ArrayList<>(strings);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
