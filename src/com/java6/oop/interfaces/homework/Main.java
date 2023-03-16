package com.java6.oop.interfaces.homework;

public class Main {
    public static void main(String[] args) {
        Ford ford = new Ford(100 , "Yes" , 60);
        System.out.println(ford.toString());
        ford.SolarPanel();
        System.out.println(ford.chargable());

    }
}
