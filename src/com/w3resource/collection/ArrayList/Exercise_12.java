package com.w3resource.collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise_12 {
    public static void main(String[] args) {
        List<String> array = new ArrayList<>();

        array.add("First");
        array.add("Second");
        array.add("Third");
        array.add("Fourth");
        array.add("Fifth");

        List<String> array2 = array.subList(0, 2);

        System.out.println(array2);
    }
}
