package com.bridgelabz;

public class Generics {
    public static Integer compareTo(Integer a,Integer b,Integer c){
        if (a>b){
            if (a>c){
                return a;
            }else{
                return c;
            }
        }else{
            if(b>c){
                return b;
            }else{
                return c;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Maximum number from given 3 numbers is " +compareTo(10,20,30));
    }
}
