package com.w3resource.collection.ArrayList;

import java.util.ArrayList;

public class Exercise_21 {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");

        c1.set(1, "NEW");
        System.out.println(c1);
    }
}
