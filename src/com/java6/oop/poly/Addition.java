package com.java6.oop.poly;

public class Addition extends Calc{
    @Override
    public void make(int x, int y) {
        System.out.println(x + y);
    }
}
