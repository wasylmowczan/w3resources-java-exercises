package com.w3resource.collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise_11 {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();

        array.add("First");
        array.add("Second");
        array.add("Third");
        array.add("Fourth");
        array.add("Fifth");

        Collections.reverse(array);

        System.out.println(array);
    }
}
