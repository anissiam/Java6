package com.java6.oop.poly;

public class Main {
    public static void main(String[] args) {


        Poly1 poly1 = new Poly1();
        Cocat cocat = new Cocat();
        poly1.poly(cocat,10,10);
        poly1.poly(new Addition(),10,10);
       /* Cocat cocat = new Cocat();
        cocat.make(10, 10);

        Addition addition = new Addition();
        addition.make(10, 10);
*/
        /*Poly poly = new Poly();
        A a = new A();
        poly.poly(a);

        A b = new B();
        poly.poly(b);

        A c = new C();
        poly.poly(c);*/
        /*A a = new A();
        a.print();


        B b = new B();
        b.print();

        a = new C();
        a.print();*/

    }

    /*public static void getPrint(A a){
        a.print("Anis");
    }*/
}
