package com.java6.oop.basics;

import java.util.Scanner;

public class Main {
    static Person person;

    public static void main(String[] args) {
        /*Person person1 = new Person();
        person1.name = "Lammes";
        person1.age = 20;
        person1.major = "CS";
        System.out.println(person1.printName("Anis"));
        person1.printData();*/

        Person person2 = new Person("Anis" , 20, "CS");
        person2.printData();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter name");
        String name = scanner.nextLine();

        System.out.println("Plz enter major");
        String major = scanner.nextLine();

        System.out.println("Plz enter age");
        int age = scanner.nextByte();
        person2 = new Person(name , age,major);
        person2.printData();



        /*Person obj1 = new Person();
        obj1.showName();
        System.out.println("Name is " + obj1.name);
        obj1.name = "Anis";
        obj1.showName();
        System.out.println("Name is " + obj1.name);

        Person person1 = new Person();
        System.out.println(person1.name);*/

    }


}
