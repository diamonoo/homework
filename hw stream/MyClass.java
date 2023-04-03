package com.example.jtstlib;

import java.util.ArrayList;
import java.util.stream.Collectors;

class MyClass {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++)
            list.add((int) (Math.random() * 50));

        System.out.println(
                "original: " + list +
                "\nwithout rep: " + list.stream().distinct().collect(Collectors.toList()) +
                "\neven-numbered from diap  : " + list.stream().filter((n) -> n % 2 == 0 && n >= 7 && n <= 17).collect(Collectors.toList()) +
                "\n*2: " + list.stream().map((a) -> a * 2).collect(Collectors.toList()) +
                "\nsort: " + list.stream().sorted().limit(4).collect(Collectors.toList()) +
                "\ncnt: " + list.stream().count() +
                "\navg: " + list.stream().mapToInt(Integer::intValue).average()
        );
    }
}