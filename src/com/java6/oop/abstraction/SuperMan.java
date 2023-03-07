package com.java6.oop.abstraction;

public class SuperMan extends SuperHero{
    @Override
    public void print() {
        System.out.println("Super Man");
    }

    @Override
    public void superPower() {
        System.out.println("Fly");
    }

    @Override
    public String getRealName() {
        return "Clark";
    }
}
