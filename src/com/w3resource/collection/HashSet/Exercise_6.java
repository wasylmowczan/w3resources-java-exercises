package com.w3resource.collection.HashSet;

import java.util.HashSet;

public class Exercise_6 {
    public static void main(String[] args) {
        HashSet<String> people = new HashSet<>();

        people.add("Jan");
        people.add("Jan");
        people.add("Ania");
        people.add("Ania");
        people.add("Szymon");

        HashSet<String> cloned = (HashSet)people.clone();
        System.out.println(cloned);
    }
}
