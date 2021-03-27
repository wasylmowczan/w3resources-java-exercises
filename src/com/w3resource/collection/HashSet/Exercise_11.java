package com.w3resource.collection.HashSet;

import java.util.HashSet;

public class Exercise_11 {
    public static void main(String[] args) {
        HashSet<String> people = new HashSet<>();

        people.add("Wasyl");
        people.add("Jan");
        people.add("Ania");
        people.add("Ania");
        people.add("Julia");

        HashSet<String> people2 = new HashSet<>();

        people2.add("Jan");
        people2.add("Jan");
        people2.add("Ania");
        people2.add("Ania");
        people2.add("Szymon");

        people.retainAll(people2);
        System.out.println(people);
    }
}
