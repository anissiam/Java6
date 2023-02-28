package com.java6.oop.encapsulation;

import java.util.Date;

public class Car {
    private String company;
    private int speed;
    private int number;
    private String color;

    private Person person;
    public Car() {
    }

    public Car(String company, int speed, int number, String color, Person person) {
        this.company = company;
        this.speed = speed;
        this.number = number;
        this.color = color;
        this.person = person;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void printCar(){
        System.out.println(company + " " + speed + " " + person.name +" " +person.age);
    }
}
