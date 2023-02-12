package com.java6.basics;

import java.util.Scanner;

public class InputData {
    static final String THIS_IS_FINAL = "value";
    public static void main(String[] args) {
        System.out.println(THIS_IS_FINAL);
        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Plz enter x ");
        int x  = input.nextInt();
        System.out.println(x);*/
        System.out.println("Plz enter the name");
        String name = input.nextLine();
        System.out.println(name.length());


        /*final int x ;
        x = 50;
        System.out.println(x);*/


        /*System.out.println("Plz enter name ");
        String name = input.nextLine();
        System.out.println(name);
        System.out.println("====================================================");

        // int x = 5;
        System.out.println("Plz enter x ");
        int x = input.nextInt();
        System.out.println("The value is " + x);
        System.out.println("====================================================");
        System.out.println("Plz enter y ");
        int y = input.nextInt();
        System.out.println("Y = " + y);*/

        /*System.out.println("Plz enter x ");
        int x = input.nextInt();

        System.out.println("Plz enter y ");
        int y = input.nextInt();

        System.out.println("Plz enter z ");
        int z = input.nextInt();

        int result = (x + y + z) / 3;
        System.out.println(result);*/

        /*String line= "This is test line for search using Scanner and Contains";
        System.out.println(line);

        System.out.println("Plz enter the word");
        String word = input.nextLine();

        System.out.println(line.contains(word));*/


        /*String line= "This is test line for search using Scanner and Contains";
        System.out.println(line);

        System.out.println("Plz enter the chat at int ");
        byte index = input.nextByte();

        System.out.println(line.charAt(index));*/






    }
}
