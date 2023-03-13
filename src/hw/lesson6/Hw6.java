package com.example.jtstlib;
class Hw6{
    public static void main(String[] args) {
        Phone phone1=new Phone();
        Phone phone2=new Phone(1334455,"xiaomi");
        Phone phone3=new Phone(772887,"bq",120);

        phone1.show();
        phone2.show();
        phone3.show();

        System.out.println(phone2.getNumber());
        phone1.sendMesage(9,4,8);
        phone3.receiveCall("Mergen","+375291234567");
    }
}