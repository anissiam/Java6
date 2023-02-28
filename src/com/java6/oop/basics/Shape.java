package com.java6.oop.basics;

public class Shape {
    String name ;
    int l;
    int w;

    public Shape() {
    }

    public Shape(String name, int l, int w) {
        this.name = name;
        this.l = l;
        this.w = w;
    }

    public void area(){
        System.out.println("The are of " + name + " = " + (l * w));
    }
    public void printShape(){
        System.out.println("Shape {Name=" + name + " Length=" + l + " Width=" + w+ "}");
    }
}
