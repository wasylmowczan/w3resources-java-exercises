package com.w3resource.collection.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Exercise_2 {
    public static void main(String[] args) {
        HashSet<String> people = new HashSet<>();

        people.add("Jan");
        people.add("Jan");
        people.add("Ania");
        people.add("Ania");
        people.add("Szymon");

        Iterator<String> pIterator = people.iterator();
        while (pIterator.hasNext()) {
            System.out.println(pIterator.next());
        }
    }
}
