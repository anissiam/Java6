package com.java6.basics;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] nums = new int[5];
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
        /*for(int i = 0 ; i<x.length;i++){
            System.out.println(x[i]);
        }*/

        for(int num:x){
            System.out.println(num);
        }
        /*for(int i = 0 ; i<nums.length;i++){
            System.out.println("Num " +  nums[i]);
        }*/

    }
}
