package com.example.jtstlib;


class ���������� {
    static void �����������(String s) {
        String res[] = s.split("-");
        System.out.println(res[0] + res[2]);
    }

    static void ���������(String s) {
        StringBuilder s2=new StringBuilder(s);
        s2.replace(5, 8, "***");
        s2.replace(14, 17, "***");
        System.out.println(s2);
    }

    static void ����������������(String s) {
        s = s.toLowerCase();
        String res[] = s.split("-");
        System.out.println(res[1] + "/" + res[3] + "/" + res[4].charAt(1) + "/" + res[4].charAt(3));
    }

    static void �����������������(String s) {
        StringBuilder s2=new StringBuilder(s.toUpperCase());
        System.out.println(s2.substring(5,8) + "/" + s2.substring(14,17) + "/" + s2.charAt(19) + "/" + s2.charAt(21));
    }

    static void ��������_���(String s) {
        s = s.toLowerCase();
        System.out.println(s.contains("abc"));
    }

    static void ���_555(String s) {
        s = s.substring(0, 3);
        System.out.println(s.equals("555"));
    }

    static void �����_1a2b(String s) {
        s = s.substring(s.length() - 4);
        System.out.println(s.equals("1a2b"));
    }
}