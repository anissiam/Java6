package com.java6.oop.abstraction;

public class BMW extends Car{
    @Override
    public void convertSpeed(double speed) {
        System.out.println("Speed = " + (speed / 0.621));
    }

    @Override
    public String carName() {
        return "BMW";
    }
}
