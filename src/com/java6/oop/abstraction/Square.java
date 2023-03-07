package com.java6.oop.abstraction;

public class Square extends Shape {
    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public void area() {
        System.out.println(length*width);
    }

    @Override
    public void printData() {
        System.out.println("Length" + length + " Width" + width);
    }

    @Override
    public int getLength() {
        return length;
    }


}
