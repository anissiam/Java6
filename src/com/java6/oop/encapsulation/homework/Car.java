package com.java6.oop.encapsulation.homework;

public class Car {
    private String name;
    private String color;
    private double maxSpeed;

    public Car() {
    }

    public Car(String name, String color, double maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void printData(){
        System.out.println("Name:" + name + " Color:" + color + " Max Speed:" + maxSpeed+"KM");
    }

    public double convertSpeed(){
        double value = maxSpeed/0.62137119223733;
        return value;
    }
}
