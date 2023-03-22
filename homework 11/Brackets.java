package com.example.jtstlib;

import java.util.LinkedList;

 class Brackets {
    static boolean check(String s){
        char   c[]=s.toCharArray();
        boolean res=true;
        LinkedList<Integer> stek = new LinkedList< >();
        A:
        for (int i=0;i<s.length() ; i++) {
            switch(c[i]){
                case '[':
                    stek.add(1);
                    break;
                case ']': 
                    if ( stek.peekLast() ==null || stek.pollLast() ==2 ){
                        res=false;
                        break A;
                    }
                break;
                case '(':
                    stek.add(2);
                    break;
                case ')': 
                    if ( stek.peekLast() ==null ||stek.pollLast() ==1 ){
                        res=false;
                        break A;
                    }
                    break;
            }
        }
        res=(res&& stek.peekLast() ==null);
        return res ;
    }
}