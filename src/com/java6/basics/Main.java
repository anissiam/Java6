package com.java6.basics;

public class Main {
    static int z; // Global
    static double zz;

    // static double zz;
    public static void main(String[] args) {

        long ddd = 1000000000000L;
        System.out.println(zz);
        zz = 90.6;
        double zz = 40.9;
        System.out.println(zz);

        double dd = 50.3;
        System.out.println(dd);
        long xx = 50;
        byte yy = 100;

        System.out.println(xx);
        System.out.println(yy);

        float f = 50.9F;
        System.out.println(f);

        char c = 'a';
        char c1 = 'n';
        System.out.println(c +" "+c1);

        boolean b = true;
        System.out.println(b);


        System.out.println(z);
        z = 50;//Update  // Set value
        //This is single line of comment

        int x = 10; // Local
        int y;
        y = x;

        System.out.println("Value is " + y);
        System.out.println("Value is " + x);
        x = 50;
        System.out.println("Value is " + x);


        System.out.println(z);
    }

    public void add() {
        System.out.println(zz);

    }
}