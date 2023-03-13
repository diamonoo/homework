package com.example.jtstlib;

class Computer { 
    double cost;
    String model;
    RAM ram;
    HDD hdd;

    Computer( double cost,  String model){
        this.cost=cost;
        this.model= model;
        ram=new RAM();
        hdd=new HDD();
    }

    Computer(double cost, String model, RAM ram, HDD hdd){
        this.cost=cost;
        this.model= model;
        this.ram=ram;
        this.hdd= hdd;
    }

    void show(){
        System.out.println(cost + " "+model);
        ram.show();
        hdd.show();
    }
}
