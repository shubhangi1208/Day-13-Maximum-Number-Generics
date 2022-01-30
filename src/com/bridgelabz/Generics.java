package com.bridgelabz;

public class Generics {
    public <T extends Comparable<T>> T compareTo(T a,T b,T c){
        if (a.compareTo(b)>0){
            if(a.compareTo(c)>0){
                return a;
            }else{
                return c;
            }
        }else{
            if(b.compareTo(c)>0){
                return b;
            }else{
                return c;
            }
        }
    }

    public static void main(String[] args) {
        Generics integerComparision=new Generics();
        System.out.println("Maximum number from given 3 Integer numbers is " +integerComparision.compareTo(10,20,30));

        Generics floatComparision=new Generics();
        System.out.println("Maximum number from given 3 Float numbers is " +floatComparision.compareTo(5.0F,10.5F,2.0F));

        Generics stringComparision=new Generics();
        System.out.println("Maximum string from given 3 string is " + stringComparision.compareTo("Apple","Peach","Banana"));
    }
}
