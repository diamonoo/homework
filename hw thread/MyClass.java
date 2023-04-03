package com.example.jtstlib;

class MyClass {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread(), t2 = new MyThread(), t3 = new MyThread();
        t3.start();
        t3.join();
        t2.start();
        t2.join();
        t1.start();
    }
}