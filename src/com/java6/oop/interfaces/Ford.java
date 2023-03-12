package com.java6.oop.interfaces;

public class Ford extends Car implements ElecCar1 ,SolarPanel{
    public Ford() {
    }

    public Ford(String modle, int speed, String color) {
        super(modle, speed, color);
    }

    public void showSpeed() {
        for (int i = 0; i < getSpeed(); i++) {
            try {
                System.out.println(i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void Barraty() {
        System.out.println("10");
    }

    @Override
    public void size() {
        System.out.println(1000);
    }

    @Override
    public int panelCount() {
        return 4;
    }

    @Override
    public void power() {
        System.out.println("Power");
    }
}
