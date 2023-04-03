package com.example.jtstlib;
import java.util.HashMap;

public class MyClass{
    public static void main(String[] args) {
        String str = "Hello Kitty";
        char ch;
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            ch= str.charAt(i);
            if (charCountMap.containsKey(ch))
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            else charCountMap.put(ch, 1);
        }
        
        for (Character c : charCountMap.keySet()) {
            System.out.println(c + ": " + charCountMap.get(c));
        }
    }
}