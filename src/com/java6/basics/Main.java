package com.java6.basics;

public class Main {
    static int z; // Global
    public static void main(String[] args) {
        System.out.println(z);
        z = 50;//Update  // Set value
        //This is single line of comment

        int x = 10; // Local
        int y;
        y = x;

        System.out.println("Value is "+y);
        System.out.println("Value is "+x);
        x = 50;
        System.out.println("Value is "+x);


        System.out.println(z);
    }
}