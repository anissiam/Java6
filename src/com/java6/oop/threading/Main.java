package com.java6.oop.threading;

public class Main {
    public static void main(String[] args) {

        RunClass runClass = new RunClass();
        runClass.setName("Thread 1 ");
        Thread thread = new Thread(runClass);
        thread.start();



        RunClass runClass1 = new RunClass();
        runClass1.setName("Thread 2 ");
        Thread thread1 = new Thread(runClass1);
        thread1.start();

        /*new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();*/

/*
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();
        try {
            threadClass.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        ThreadClass threadClass1 = new ThreadClass();
        threadClass1.start();

        ThreadClass threadClass3 = new ThreadClass();
        threadClass3.start();*/
    }
}
