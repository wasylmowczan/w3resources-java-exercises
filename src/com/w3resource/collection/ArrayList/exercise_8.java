package com.w3resource.collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exercise_8 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("BFirst");
        strings.add("ASecond");

        Collections.sort(strings);

        System.out.println(strings);
    }
}
