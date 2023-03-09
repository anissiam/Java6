package com.java6.oop.basics;

import java.util.ArrayList;

public class Wrapper {
    public static void main(String[] args) {

        int x = 5;
        System.out.println(x);

        Integer xx = Integer.valueOf("5");  // P -> Object
        System.out.println(xx);
        System.out.println(xx.floatValue());

        int ww = Integer.parseInt("5"); // non -- > pr
        System.out.println(ww);

        System.out.println(Integer.max(10, 50));
        System.out.println(Integer.min(10, 50));



    }
}
