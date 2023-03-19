package com.java6.basics;

import com.java6.oop.encapsulation.Person;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    static Person person;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int[] nums = new int[5];
            nums[5] = 10;
            System.out.println(nums[1] / 0);
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e);
        }

        /*try {
            //int num = scanner.nextInt();

            System.out.println(10/0);//Throw
            System.out.println(person.getAge());

        } catch (ArithmeticException e) {
            System.out.println(e);
            //return;
        }catch (NullPointerException e){
            System.out.println(e);
            person = new Person();
            System.out.println(person.getAge());
        }catch (InputMismatchException e){
            System.out.println(e);
        }finally {
            System.out.println("Finally");
        }

        System.out.println("Done");*/

    }
}
