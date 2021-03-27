package com.w3resource.collection.HashSet;

import java.util.HashSet;

public class Exercise_7 {
    public static void main(String[] args) {
        HashSet<String> people = new HashSet<>();

        people.add("Jan");
        people.add("Jan");
        people.add("Ania");
        people.add("Ania");
        people.add("Szymon");

        String[] array = new String[people.size()];
        people.toArray(array);

        for (String s : array) {
            System.out.println(s);
        }
    }
}
