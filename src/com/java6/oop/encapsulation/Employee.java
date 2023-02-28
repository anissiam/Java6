package com.java6.oop.encapsulation;

public class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setYearOfJoining(int yearOfJoining){
        this.yearOfJoining = yearOfJoining;
    }

    public void printEmployee(){
        System.out.println("Name: " + name + " Year Of Joining:"  +yearOfJoining + " Address" + address);
    }
}
