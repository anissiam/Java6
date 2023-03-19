package com.java6.oop.genaric;

public class Main {
    public static void main(String[] args) {

        MyClass<Integer> integerMyClass = new MyClass<>();
        System.out.println(integerMyClass.printInteger(10));


        MyClass<String> stringMyClass = new MyClass<>();
        System.out.println(stringMyClass.printInteger("anis"));

        printTest("Anis");
        printTest(10);
        printTest(500.5);
        printTest('A');
       /* PrintDouble printDouble = new PrintDouble();
        printDouble.printDoub();



        PrintInt printInt = new PrintInt();
        printInt.printInteger();*/

    }

    public static <T> void printTest(T t){
       System.out.println(t);
    }
}
