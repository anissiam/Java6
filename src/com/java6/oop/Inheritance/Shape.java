package com.java6.oop.Inheritance;

public class Shape {
    int length;
    int width;

    public Shape() {
    }

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void printData(){
        System.out.println("Length " + length + " Width" + width);
    }
    public int area(){
        return 0;
    }

    public void per(){
        System.out.println("per");
    }
}
