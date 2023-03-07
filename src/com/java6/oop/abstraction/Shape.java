package com.java6.oop.abstraction;

public abstract class Shape {
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

    public abstract void area();



    public abstract void printData();

    public abstract int getLength();

}
