package com.w3resource.collection.HashSet;

import java.util.HashSet;

public class Exercise_10 {
    public static void main(String[] args) {
        HashSet<String> people = new HashSet<>();

        people.add("Jan");
        people.add("Jan");
        people.add("Ania");
        people.add("Ania");
        people.add("Szymon");

        HashSet<String> people2 = new HashSet<>();

        people2.add("Jan");
        people2.add("Jan");
        people2.add("Ania");
        people2.add("Ania");
        people2.add("Szymon");

        HashSet<String> result = new HashSet<>();
        for (String person : people) {
            System.out.println(people2.contains(person) ? "Yes" : "No");
        }
    }
}
