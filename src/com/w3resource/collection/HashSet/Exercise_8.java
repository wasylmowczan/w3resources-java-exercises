package com.w3resource.collection.HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise_8 {
    public static void main(String[] args) {
        HashSet<String> people = new HashSet<>();

        people.add("Jan");
        people.add("Jan");
        people.add("Ania");
        people.add("Ania");
        people.add("Szymon");

        Set<String> tree_set = new TreeSet<String>(people);

        for (String s : tree_set) {
            System.out.println(s);
        }
    }
}
