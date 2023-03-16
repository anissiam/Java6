package com.java6.oop.interfaces.homework;

public class Car {
    private int speed;
    private String control;
    private int size;

    public Car() {
    }

    public Car(int speed, String control, int size) {
        this.speed = speed;
        this.control = control;
        this.size = size;
    }
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", control='" + control + '\'' +
                ", size=" + size +
                '}';
    }
}
