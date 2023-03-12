package com.java6.oop.interfaces;

public class Car {
    private String modle;
    private int speed;

    private String color;

    public Car() {
    }

    public Car(String modle, int speed, String color) {
        this.modle = modle;
        this.speed = speed;
        this.color = color;
    }

    public String getModle() {
        return modle;
    }

    public void setModle(String modle) {
        this.modle = modle;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modle='" + modle + '\'' +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
