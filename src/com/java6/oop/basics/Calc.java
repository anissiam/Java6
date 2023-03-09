package com.java6.oop.basics;

public class Calc {
    public static void add(int x , int y) {
        System.out.println(x + y);
    }
    public static void sub(int x , int y) {
        System.out.println(x - y);
    }
    public static void multi(int x , int y) {
        System.out.println(x * y);
    }
    public static void div(int x , int y) {
        if(y==0){
            System.out.println("Not defined");
            return;
        }
        System.out.println(x / y);
    }
}
