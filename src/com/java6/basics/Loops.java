package com.java6.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*System.out.println("Hello"); //0
        System.out.println("Hello");//1
        System.out.println("Hello");//2
        System.out.println("Hello");//3
        System.out.println("Hello");//4*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter number");
        int num = scanner.nextInt();
        while (true){
            if(num==0){
                break;
            }
            System.out.println("Correct");
            System.out.println("Plz enter new number");
            num = scanner.nextInt();
        }
        /*while (num!=0){
            System.out.println("Correct");
            System.out.println("Plz enter new number");
            num = scanner.nextInt();
        }*/
       /* int i = 1;
        while (i < 100) {

            System.out.println(i);
            i+=2;
        }*/

        /*int i = 0;
        int sum = 0;
        while (i < 100) {
            i += 2;
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println(sum);*/

        /*int i = 0;
        while (i<=100){
            i++;
            if(i%2==0){
                System.out.println(i);
            }
        }*/
        /*int i = 100;
        while (i > 0) {
            i--;
            if (i != 0) {
                System.out.println(i);

            }

        }*/
        /*int i = 0;
        int sum = 0;//
        while (i<3){
            i++;
            sum = sum + i;//
        }
        System.out.println(sum);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter line");
        String line = scanner.nextLine();

        int i = 0;
        while (i<line.length()){
            System.out.println(line.charAt(i));
            i++;
        }*/
       /* int i = 0;
        while (i<=4){
           System.out.println(i);
            i++;
        }*/
    }
}
