package com.example.jtstlib;


class ќбработчик {
    static void только÷ифры(String s) {
        String res[] = s.split("-");
        System.out.println(res[0] + res[2]);
    }

    static void звездочки(String s) {
        StringBuilder s2=new StringBuilder(s);
        s2.replace(5, 8, "***");
        s2.replace(14, 17, "***");
        System.out.println(s2);
    }

    static void кЌижнему–егистру(String s) {
        s = s.toLowerCase();
        String res[] = s.split("-");
        System.out.println(res[1] + "/" + res[3] + "/" + res[4].charAt(1) + "/" + res[4].charAt(3));
    }

    static void к¬ерхнему–егистру(String s) {
        StringBuilder s2=new StringBuilder(s.toUpperCase());
        System.out.println(s2.substring(5,8) + "/" + s2.substring(14,17) + "/" + s2.charAt(19) + "/" + s2.charAt(21));
    }

    static void содержит_абц(String s) {
        s = s.toLowerCase();
        System.out.println(s.contains("abc"));
    }

    static void нач_555(String s) {
        s = s.substring(0, 3);
        System.out.println(s.equals("555"));
    }

    static void конец_1a2b(String s) {
        s = s.substring(s.length() - 4);
        System.out.println(s.equals("1a2b"));
    }
}