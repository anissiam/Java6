package com.java6.oop.Inheritance;

public class Rami extends Person{

    String family;
    public void printFamily(){
        System.out.println(family);
    }

    @Override
    public void printData() {
        System.out.println(super.name);
        System.out.println(name);

    }
}
