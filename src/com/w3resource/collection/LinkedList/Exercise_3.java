package com.w3resource.collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Exercise_3 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        for (int i = 1; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

        //or

        // set Iterator at specified index
        Iterator p = strings.listIterator(1);

        // print list from second position
        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}
