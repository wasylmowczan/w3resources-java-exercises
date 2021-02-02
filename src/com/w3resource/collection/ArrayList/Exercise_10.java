package com.w3resource.collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise_10 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(i);
        }
        System.out.println("List before shuffle: " + numbers.toString());

        Collections.shuffle(numbers);

        System.out.println("List after shuffle: " + numbers.toString());
    }
}
