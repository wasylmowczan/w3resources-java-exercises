package com.w3resource.collection.ArrayList;

import java.util.ArrayList;

public class Exercise_19 {
    public static void main(String[] args) {
        ArrayList<String> original = new ArrayList<String>();
        original.add("1");
        original.add("2");
        original.add("3");
        original.add("4");
        original.add("5");

        original.trimToSize();
        System.out.println(original);
    }
}
