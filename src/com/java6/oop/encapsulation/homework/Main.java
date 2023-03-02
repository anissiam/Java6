package com.java6.oop.encapsulation.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter car name");
        String carName = scanner.nextLine();

        System.out.println("Plz enter Color");
        String color = scanner.nextLine();

        System.out.println("Plz enter Max speed");
        double speed = scanner.nextDouble();
        Car car = new Car(carName, color, speed);
        System.out.println("1.Print data\n2.Convert Speed\n-> Exit");
        int c = scanner.nextInt();
        switch (c) {
            case 1:
                car.printData();
                break;
            case 2:
                System.out.println(car.convertSpeed());
                break;
            default:
                System.out.println("Exit");
                System.exit(0);
        }

    }
}

