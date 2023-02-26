package com.java6.oop.basics;

public class Person {
    String name;
    int age;
    String major;
    public Person(){
        System.out.println("Hi");
    }
    public Person(String name , int age , String major){
        this.name = name;
        this.age = age;
        this.major = major;
    }
    public void printData(){
        System.out.println("Name: " + name + " Age:" + age + " Major:" + major);
    }

    public String printName(String name) {
        return this.name;
    }
}
