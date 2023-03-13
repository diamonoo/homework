package com.example.jtstlib;

public class Phone {
    private int number, weight;
    private String model;

    Phone(int number,String model  ){
        this.number=number;
        this.model=model;
    }
    Phone(int number,String model , int weight  ){
        this(number,model);
        this.weight=weight;
    }
    Phone(  ){}
    void show(){
        System.out.println(number+" "+model+" "+weight);
    }
    void receiveCall(String name){
        System.out.println(name+" is calling");
    }
    void receiveCall(String name,String number){
        System.out.println(name+" is calling, "+ number);
    }
    void sendMesage(int ...nums){
        for (int num : nums) {
            System.out.println(num);
        }
    }
    int getNumber(){
        return number;
    }

}
