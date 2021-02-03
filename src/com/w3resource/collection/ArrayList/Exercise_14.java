package com.w3resource.collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise_14 {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("1");
        c1.add("2");
        c1.add("3");
        c1.add("4");
        c1.add("5");

        Collections.swap(c1, 1, 2);
        System.out.println(c1);
    }
}
