package com.java6.oop.encapsulation;

public class Person {
    String name;
    int age;

    public Person(){

    }
    public Person(String name , int age ){
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printData(){
        System.out.println("Name: " + name + " Age:" + age);
    }


}
