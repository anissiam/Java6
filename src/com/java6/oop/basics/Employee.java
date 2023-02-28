package com.java6.oop.basics;

public class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    public Employee() {
    }

    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }
    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public void printEmployee(){
        System.out.println("Name: " + name + " Year Of Joining:"  +yearOfJoining + " Address" + address);
    }
}
