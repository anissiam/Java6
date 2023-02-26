package com.java6.basics;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums[] = new int[10];
        int min = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Plz enter nums["+i+"]");
            nums[i] = scanner.nextInt();
            if(i==0){
                max = nums[i];
                min = nums[i];
            }

        }
        /*String[][] month = {{"sat" , "Sun" , "Mon" , "Tus" , "Wend" , "Thr", "Fri"},
                {"sat" , "Sun" , "Mon" , "Tus" , "Wend" , "Thr" ,"Fri"},
                {"sat" , "Sun" , "Mon" , "Tus" , "Wend" , "Thr", "Fri"},
                {"sat" , "Sun" , "Mon" , "Tus" , "Wend" , "Thr", "Fri"}};


        for (int i = 0; i < month.length; i++) {
            System.out.println("Week" + (i + 1));
            for (int j = 0; j < month[i].length; j++) {
                System.out.print(month[i][j] + "  ");
            }
            System.out.println();
        }*/
        //int nums[][] = new int[3][5];
        /*int nums1[][] = {{1,5,3}, {5,8,9 , 9}, {1,8,9}};
        System.out.println(nums1.length); // Row count
        System.out.println(nums1[0].length);
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1[i].length; j++) {
                System.out.print(nums1[i][j] + "  ");
            }
            System.out.println();
        }*/



        /*String arr1[] = {"ALi", "Sami", "SOSO", "RORO"};
        String arr2[] = {"FOFO", "Medo", "Ibrahim", "ALI"};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i].equalsIgnoreCase(arr2[j])){
                    System.out.println(arr1[i]);
                }
            }
        }*/


        /*Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter num[" + i + "]");
            nums[i] = scanner.nextInt();
            *//*if(nums[i]==0){
                System.out.println("not even nor odd");
                continue;
            }
            if(nums[i]%2==0){
                System.out.println(nums[i] + " Even");
            }else {
                System.out.println(nums[i] + " Odd");
            }*//*
        }*/
        /*System.out.println("search for : ");
        int x = scanner.nextInt();*/
        /*int sum = 0;
        for (int w:nums) {
            sum += w;
            *//*if(w==x){
                System.out.println(w + " is found");
                break;
            }*//*
        }
        System.out.println(sum);*/
        /*int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Sum is" + sum);*/


        /*for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                System.out.println("Zero");
            } else if (nums[i] % 2 == 0) {
                System.out.println(nums[i] + " Even");
            } else {
                System.out.println(nums[i] + " Odd");
            }
        }*/
        /*for (int i : nums) {
            if (i == 0) {
                System.out.println("Zero");
            } else if (i % 2 == 0) {
                System.out.println(i + " Even");
            } else {
                System.out.println(i + " Odd");
            }
        }*/
        /*for (int i = 0; i < nums.length; i++) {
            System.out.println("Plz enter num");
            nums[i] = scanner.nextInt();
        }

        for (int x : nums) {
            System.out.print(x + "  ");
        }
        System.out.println();
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            if(min>nums[i]){
                min = nums[i];
            }
        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter array size");
        int size = scanner.nextInt();
        String[] names = new String[size];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Plz enter name");
            names[i] = scanner.next();
        }

        System.out.println("Search about ");
        String name = scanner.next();
        for (int i = 0; i < names.length; i++) {
            if(names[i].equalsIgnoreCase(name)){
                System.out.println("Plz enter new name");
                names[i] = scanner.next();
            }
        }*/

        /*for (String s:names) {
           if(s.equalsIgnoreCase("anis")){
               System.out.println("Found");
           }
        }*/
        /*int[] nums = new int[5];
        System.out.println(nums.length);
        System.out.println(nums[0]);
        //System.out.println(nums[5]);
        //System.out.println(nums[-1]);
        nums[0] = 5;
        System.out.println(nums[0]);
        nums[1] = nums[0];
        System.out.println(nums[1]);

        for(int i = 0 ; i<nums.length;i++){
            System.out.println("Num " +  nums[i]);
        }


        int[] x = {10, 50, 2, 3, 7};
        *//*for(int i = 0 ; i<x.length;i++){
            System.out.println(x[i]);
        }*//*

        for(int num:x){
            System.out.println(num);
        }*/
        /*for(int i = 0 ; i<nums.length;i++){
            System.out.println("Num " +  nums[i]);
        }*/

    }
}
