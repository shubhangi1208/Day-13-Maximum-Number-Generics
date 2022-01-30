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
    public static Float compareTo(Float a,Float b,Float c){
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
    public static String compareTo(String str1,String str2,String str3) {
        if(str1.compareTo(str2) > 0) {
            if(str1.compareTo(str3) > 0) {
                return str1;
            } else {
                return str3;
            }
        } else {
            if(str2.compareTo(str3) > 0) {
                return str2;
            } else {
                return str3;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Maximum number from given 3 Integer numbers is " +compareTo(10,20,30));
        System.out.println("Maximum number from given 3 Float numbers is " +compareTo(5.0F,10.5F,2.0F));
        System.out.println("Maximum string from given 3 string is " + compareTo("Apple","Peach","Banana"));
    }
}
