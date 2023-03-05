package com.java6.oop.Inheritance;

public class Circle extends Shape{
    int rad;
    private final double PI = 3.14;

    public Circle(int rad) {

        this.rad = rad;

    }

   /* public void printData(){
        System.out.println("Rad" + rad);
    }

    public double area(){
        return PI*(rad*rad);
    }

    public void per(){
        System.out.println(2*PI*rad);
    }*/
}
