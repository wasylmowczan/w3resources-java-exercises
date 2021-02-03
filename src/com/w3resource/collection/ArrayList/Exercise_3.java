package com.w3resource.collection.ArrayList;

import java.util.LinkedList;

public class Exercise_3 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        strings.addFirst("First");
        strings.add("Middle");
        strings.addLast("lAST");

        System.out.println(strings);
    }
}
