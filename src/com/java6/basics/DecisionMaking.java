package com.java6.basics;

import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter line");
        String line = scanner.nextLine();

        if(line.isEmpty()){
            System.out.println("Empty");
        }else if(line.contains("@")){
            System.out.println("Email");
        }else if(line.length()>5){
            System.out.println("Up to 5 ");
        }else if(!line.equals("HI")){
            System.out.println("not hi");
        }

       /* System.out.println("Plz enter mark");
        int mark = scanner.nextInt();

        if(mark<50){
            System.out.println("not success");
            return;
        }

        if(mark>=90){
            System.out.println("Nice");
        }else if (mark>=80){
            System.out.println("Good");
        }else if(mark>=70){
            System.out.println("Accept");
        }else if(mark>=50){
            System.out.println("Success");
        }*/

        // T  AND T ->> T
        //int x = scanner.nextInt();
        /*if (x > 0 || x % 2 == 0) {
            System.out.println("up to 0  and Even");
        } else {
            System.out.println("not valid");
        }*/

        /*if(x>0){
            if(x%2==0){
                System.out.println("up to 0  and Even");
            }else {
                System.out.println("UP to 0 and Odd");
            }
        }else {
          System.out.println("Less than 0 ");
        }*/


        /*System.out.println("Plz enter name");
        String name = scanner.nextLine();



        if(!name.isEmpty()&& name.equalsIgnoreCase("anis")){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }*/
       /* System.out.println("Plz enter email");
        String email = scanner.nextLine();

        if(email.length() == 0){
            System.out.println("Empty email");
            return;
        }*/

        /*if(email.isEmpty()){
            System.out.println("Empty email");
            return;
        }*/

        /*if(email.contains("@")){
            System.out.println("Email");
        }else {
            System.out.println("not email");
        }*/
        /*System.out.println("Plz enter the value");
        int x = scanner.nextInt();

        if(x==0){
            System.out.println("not valid");
            return;
        }

        if(x>0){
            System.out.println("grater or equal then 0");
        }else {
            System.out.println("Less than 0 ");
        }
        */

        System.out.println("Done");
    }
}
