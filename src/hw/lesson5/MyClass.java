package com.example.jtstlib;
class MyClass {
    public static void main(String[] args) {
        Computer computer1= new Computer(123,"empty" );
        computer1.show();
        System.out.println("........................");
        Computer computer2= new Computer(65,"asus",
                new RAM("ddr4",16000), new HDD("toshiba",3,"ext")  );
        computer2.show();
    }
}