package com.w3resource.basic_part_I;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise_47 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd HH:mm:ss.SSS";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new Date());
        System.out.println(date);
    }
}
