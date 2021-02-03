package com.w3resource.collection.ArrayList;

import java.util.ArrayList;

public class Exercise_15 {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("1");
        a1.add("2");
        a1.add("3");
        a1.add("4");
        a1.add("5");

        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("6");
        a2.add("7");
        a2.add("8");
        a2.add("9");
        a2.add("10");

        ArrayList<String> b = new ArrayList<String>();
        b.addAll(a1);
        b.addAll(a2);

        System.out.println(b);
    }
}
