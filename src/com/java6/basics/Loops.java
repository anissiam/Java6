package com.java6.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



       /* for(int i = 0 ; i <4 ; i++){
            System.out.println("Week" + (i+1));
            for(int j= 0 ; j <7 ;j++){
                System.out.print("Day" + (j + 1) + "  ");
            }
            System.out.println();
        }*/



        /*for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
*/

//        int i = 0;
//        for (; i < 100; System.out.println(i)) {
//
//            i += 2;
//        }


        /*Scanner scanner = new Scanner(System.in);
        int num;
        for (int i = 0; i < 5; i++) {
            System.out.println("Plz enter num");
            num = scanner.nextInt();
            if(num%2==0){
                System.out.println("EVen");
            }else {
                System.out.println("Odd");
            }
        }*/

        /*System.out.println("Hello"); //0
        System.out.println("Hello");//1
        System.out.println("Hello");//2
        System.out.println("Hello");//3
        System.out.println("Hello");//4*/
        /*Scanner scanner = new Scanner(System.in);

        String ss;
        for(;;){
            System.out.println("Plz enter word");
             ss = scanner.nextLine();
             if(ss.equalsIgnoreCase("hi")){
                 System.out.println("Found");
                 break;
             }
        }*/

        /*int i = 0;
        for (; ; ) {
            if (i < 5) {
                break;
            }
            System.out.println(i);
            i++;
        }*/
        /*Scanner scanner = new Scanner(System.in);
        int x;
        int max  = 0;
        int min = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Add new number");
            x = scanner.nextInt();
            if (i == 0) {
                max = x;
                min = x;
            }
            if (max < x) {
                max = x;
            }
            if(min>x){
                min = x;
            }
        }
        System.out.println("Max is " + max);
        System.out.println("MIn is " + min);*/


        /*int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);*/



        /*int i = 5;
        while (i<5){
            System.out.println("Hi");
        }*/

       /* int i = 5;
        do {
            System.out.println("hi");
        }while (i<5);*/

        /*Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 4) {
            i++;
            if (i == 3) {
                continue;
            }
            if(i==5){
                break;
            }
            System.out.println(i);
        }*/

        /*System.out.println("Plz enter Strings");
        String s = scanner.nextLine();
        while (true) {
            if (s.equalsIgnoreCase("stop")) {
                System.out.println("App is Stopped");
                break;
            }
            if (s.equalsIgnoreCase("run")) {
                System.out.println(s);
                s = scanner.nextLine();
                System.out.println("App is running");
                continue;
            }
            System.out.println(s);
            s = scanner.nextLine();
        }*/
        /*System.out.println("Plz enter Strings");
        String s = scanner.nextLine();
        while (!s.equalsIgnoreCase("Stop")){
            *//*if(s.equalsIgnoreCase("stop")){
                System.out.println("App is Stopped");
                return;
            }*//*
            System.out.println(s);
            s = scanner.nextLine();
        }*/




        /*System.out.println("Plz enter number");

        int num = scanner.nextInt();
        while (true){
            if(num==0){
                break;
            }
            System.out.println("Correct");
            System.out.println("Plz enter new number");
            num = scanner.nextInt();
        }*/
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
