package com.w3resource.collection.HashSet;

import java.util.HashSet;

public class Exercise_1 {
    public static void main(String[] args) {
        HashSet<String> people = new HashSet<>();

        people.add("Jan");
        people.add("Jan");
        people.add("Ania");
        people.add("Ania");
        people.add("Szymon");

        people.add("Wasyl");
        System.out.println(people);
    }
}
