package com.w3resource.collection.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class Exercise_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
