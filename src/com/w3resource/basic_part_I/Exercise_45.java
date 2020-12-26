package com.w3resource.basic_part_I;

import java.io.File;

public class Exercise_45 {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        File file2 = new File("text.txt");
        System.out.println(file.length() + " bytes");
        System.out.println(file2.length() + " bytes");
    }
}
