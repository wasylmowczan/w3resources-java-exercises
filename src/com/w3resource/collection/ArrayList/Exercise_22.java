package com.w3resource.collection.ArrayList;

import java.util.ArrayList;

public class Exercise_22 {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");

        for (int i = 0; i < c1.size(); i++) {
            System.out.println(c1.get(i));
        }
    }
}
