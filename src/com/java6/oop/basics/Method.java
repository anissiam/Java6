package com.java6.oop.basics;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        System.out.println(printName("Anis "));

        /*add();
        add(10, 20);
        add("10","20");
        add("10", "20", 10);
        add("10", "20", 'a');*/

        //maxMin();
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter x");
        int x = scanner.nextInt();
        System.out.println("Plz enter x");
        int y = scanner.nextInt();*/


        /*System.out.println("1.Add\n2.Sub\n3.Multi\n4.div\n5.Exit");
        int c = scanner.nextInt();
        switch (c) {
            case 1:
                add2(x, y);
                break;
            case 2:
                sub2(x, y);
                break;
            case 3:
                System.out.println(multi(x, y));
                break;
            case 5:
                System.exit(0);
        }*/

       /* add2(x,y);
        sub2(x, y);*/

        //printMonth();
        //add();
        //sub();
        //ava();

    }

    public static void maxMin(){
        Scanner scanner = new Scanner(System.in);
        int min=0;
        int max=0;
        int num;
        for (int i = 0; i < 5; i++) {
            System.out.println("Plz enter num ");
            num = scanner.nextInt();
            if(i==0){
                max = num;
                min = num;
                continue;
            }
            if(max<num){
                max = num;
            }
            if(min>num ){
                min = num;
            }
        }
        System.out.println("Max is " + max +"\n"+
                "Min is " + min);
    }

    public static String printName(String name){

        return name.trim();
    }
    public static void ava() {
        int ava = add1() / 2;
        System.out.println(ava);
    }

    /*public static int getSum(){

        return 0;
    }
     */
    public static void printMonth() {
        String[][] month = {{"sat", "Sun", "Mon", "Tus", "Wend", "Thr", "Fri"},
                {"sat", "Sun", "Mon", "Tus", "Wend", "Thr", "Fri"},
                {"sat", "Sun", "Mon", "Tus", "Wend", "Thr", "Fri"},
                {"sat", "Sun", "Mon", "Tus", "Wend", "Thr", "Fri"}};


        for (int i = 0; i < month.length; i++) {
            System.out.println("Week" + (i + 1));
            for (int j = 0; j < month[i].length; j++) {
                System.out.print(month[i][j] + "  ");
            }
            System.out.println();
        }
    }


    public static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter x");
        int x = scanner.nextInt();
        System.out.println("Plz enter x");
        int y = scanner.nextInt();
        int z = x + y;
        System.out.println(z);
    }

    public static void add(int x , int y) {

        int z = x + y;
        System.out.println(z);
    }

    public static void add(String x , String y) {

        System.out.println(x + y);
    }

    public static void add(String x, String y, int w) {

        System.out.println(x + y);
    }
    public static void add(String x, String y, char w) {

        System.out.println(x + y);
    }

    public static int add1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter x");
        int x = scanner.nextInt();
        System.out.println("Plz enter x");
        int y = scanner.nextInt();
        int z = x + y;
        return z;
    }

    public static void sub() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter x");
        int x = scanner.nextInt();
        System.out.println("Plz enter x");
        int y = scanner.nextInt();
        int z = x - y;
        System.out.println(z);
    }


    public static void sub2(int x, int y) {

        int z = x - y;
        System.out.println(z);
    }

    public static void add2(int x, int y) {

        int z = x + y;
        System.out.println(z);
    }

    public static int multi(int s, int v) {
        return (s * v);
    }



}
