package com.java6.oop.basics;

public class Main {
    static Person person;

    public static void main(String[] args) {
        Person obj1 = new Person();
        obj1.showName();
        System.out.println("Name is " + obj1.name);
        obj1.name = "Anis";
        obj1.showName();
        System.out.println("Name is " + obj1.name);

        Person person1 = new Person();
        System.out.println(person1.name);

    }


}
