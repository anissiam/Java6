package com.java6.oop.Inheritance.homework;

public class Circle extends Shape{
    public Circle(int rad) {
        super(rad);
    }

    @Override
    public void area() {
        System.out.println("Are=" + 3.14* (rad*rad));
    }
}
