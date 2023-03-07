package com.java6.oop.Inheritance.homework;

public class Shape {
    int length;
    int width;
    int rad;

    public Shape() {
    }

    public Shape(int rad) {
        this.rad = rad;
    }

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Shape(int length, int width, int rad) {
        this.length = length;
        this.width = width;
        this.rad = rad;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public void area(){
        System.out.println("Area");
    }

    @Override
    public String toString() {
        return "Shape{" +
                "length=" + length +
                ", width=" + width +
                ", rad=" + rad +
                '}';
    }
}
