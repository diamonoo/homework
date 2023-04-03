package com.example.jtstlib;

class MyThread extends Thread {
    @Override
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(getName());
    }
}