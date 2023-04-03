package com.example.jtstlib;

public class HDD {
    String name;
    int size;
    String type;

    HDD(){	}

    HDD(String name,int size,  String type){
        this.name=name;
        this.size=size;
        this.type=type;
    }

    void show(){
        System.out.println(name +" "+ size+" "+ type);
    }
}
