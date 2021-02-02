package com.w3resource.collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise_9 {
    public static void main(String[] args) {
        List<String> strings1 = new ArrayList<>();
        List<String> strings2 = new ArrayList<>();
        strings1.add("First");
        strings1.add("Second");

        strings2.addAll(strings1);

        System.out.println(strings2);
    }
}
