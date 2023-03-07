package com.java6.oop.Inheritance.homework;

public class Square extends Shape{
    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public void area() {

        System.out.println("Area=" + length * width);
    }
}
