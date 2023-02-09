package com.java6.basics;

public class Strings {
    String name;
    public static void main(String[] args) {
        String line  = "Hello to java class Hello to java class Hello to java class Hello to java class Hello to java class Hello to java class Hello to java class Hello to java class Hello to java class Hello to java class Hello to java class Hello to java class Hello to java class Hello to java class ";
        String name  = "    Java    ";
        String name1 = "Java";
        String name2 = new String("Java");
        System.out.println(name == name1); // By ref
        System.out.println(name == name2); // By ref
        System.out.println(name.equals(name2)); //By value
        System.out.println("Anis".equals("anis")); //By value
        System.out.println("Anis".equalsIgnoreCase("anis")); //By value
        String ss = " Class";
        System.out.println(name.concat(ss));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        name = name.toLowerCase();
        System.out.println(name);
        System.out.println(line.indexOf("java"));
        System.out.println(line.indexOf('j'));
        System.out.println(line.indexOf('a'));
        System.out.println(line.lastIndexOf('a'));
        System.out.println(line.substring(2));
        System.out.println(line.substring(2,10));
        System.out.println(line.charAt(2));
        System.out.println(line.charAt(10));
        System.out.println(line.contains("java"));
        System.out.println(line.contains("java  "));
        System.out.println(line.contains("c++"));
        System.out.println(line.replace("java" , "c++"));
        System.out.println(name);
        System.out.println(name.trim());
        System.out.println(line.startsWith("hi"));
        System.out.println(line.endsWith("hi"));
        System.out.println(line.startsWith("H"));
        System.out.println(line.startsWith("Hell"));
        System.out.println(line.endsWith("class "));














    }
}
