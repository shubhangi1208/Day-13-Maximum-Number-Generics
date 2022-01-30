package com.bridgelabz;

public class Generics<T extends Comparable<T>>  {
    T a,b,c;
    Generics(T a,T b,T c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public T compareTo(){
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
        Generics integerComparision=new Generics(10,20,30);
        System.out.println("Maximum number from given 3 Integer numbers is " +integerComparision.compareTo());

        Generics floatComparision=new Generics(5.0F,10.5F,2.0F);
        System.out.println("Maximum number from given 3 Float numbers is " +floatComparision.compareTo());

        Generics stringComparision=new Generics("Apple","Peach","Banana");
        System.out.println("Maximum string from given 3 string is " + stringComparision.compareTo());
    }
}
