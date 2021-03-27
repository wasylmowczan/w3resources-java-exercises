package com.w3resource.collection.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exercise_9 {
    public static void main(String[] args) {
        HashSet<String> people = new HashSet<>();

        people.add("Jan");
        people.add("Jan");
        people.add("Ania");
        people.add("Ania");
        people.add("Szymon");

        List<String> list = new ArrayList<>(people);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
