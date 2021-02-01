package com.w3resource.collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise_4 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        strings.remove("Third");

        System.out.println(strings);
    }
}
