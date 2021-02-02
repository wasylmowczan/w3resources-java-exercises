package com.w3resource.collection.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise_5 {

    public static void main(String[] args) {
        List<String> array = new ArrayList<>();
        array.add("First");
        array.add("Second");
        array.add("Third");

        array.set(1, "Updated");

        System.out.println(array);
    }
}
