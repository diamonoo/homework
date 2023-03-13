package com.example.jtstlib;
class Bank{
    public static void main(String[] args) {
        Bankomat b=new Bankomat(3, 5, 7);
        if (!b.get(10990)) System.out.println("dont have");
    }
}