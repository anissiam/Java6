package com.java6.oop.interfaces.homework;

public class Ford extends Car implements Solar{
    public Ford() {
    }

    public Ford(int speed, String control, int size) {
        super(speed, control, size);
    }

    @Override
    public void SolarPanel() {
    System.out.println("1");
    }

    @Override
    public boolean chargable() {
        return true;
    }
}
