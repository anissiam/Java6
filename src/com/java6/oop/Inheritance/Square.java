package com.java6.oop.Inheritance;

public class Square extends Shape{

    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public void printData() {
        System.out.println("Length " + length + " Width" + width);
        super.printData();
    }

    @Override
    public int area() {
        return length*width;
    }

    @Override
    public void per() {
        System.out.println(length * 4);
    }

    public void inputData(int l, int w){
        length = l;
        if(l!=w){
            System.out.println("The length equal to width");
            w = l;
            width = w;
        }else {
            width = w;
        }

    }

    /*public void printData(){
        System.out.println("Length " + length + " Width" + width);
    }

    public int area(){
        return length * width;
    }

    public void per(){
        System.out.println(length * 4);
    }*/
}
