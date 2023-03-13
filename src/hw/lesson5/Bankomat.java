package com.example.jtstlib;

class Bankomat {
    private int numOf20, numOf50, numOf100;
    Bankomat(int numOf20, int numOf50, int numOf100){
        this.numOf20= numOf20;
        this.numOf50= numOf50;
        this.numOf100=numOf100;
    }
    void add(int nominal, int num){
        switch (nominal){
            case 20:
                numOf20+=num; break;
            case 50:
                numOf50+=num; break;
            case 100:
                numOf100+=num; break;
            default:
                System.out.println("wrong type");
        }
    }
    boolean get(int s){
        //  if (s%10!=0) System.out.println("% 10"); return false;
        //  if (s<20) System.out.println("< 20"); return false;
        int a,b,c;
        c= Math.min(s/100, numOf100);
        s=s-c*100;
        b= Math.min(s/50, numOf50);
        s=s-b*50;
        a= Math.min(s/20, numOf20);
        s=s-a*20;
        if (s==0) {
            System.out.println(c+" 100-k, "+b+" 50-k, "+a+" 20-k. ");
         //   add( 100,-c); add( 50,-b); add( 20,-a);
            return true;
        }
        else {
            return false;
        }



    }
}
