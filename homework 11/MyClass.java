package com.example.jtstlib;

class MyClass {
    public static void main(String[] args) {
		
		
        System.out.println(Brackets.check("[ ( ] )")); //false
        System.out.println(Brackets.check("[  ] ()")); //true
    }
}