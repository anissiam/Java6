package com.java6.oop.threading;

import com.java6.oop.encapsulation.Person;

public class RunClass extends Person implements Runnable{
    private String name;
    @Override
    public void run() {
        System.out.println(getName());
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
