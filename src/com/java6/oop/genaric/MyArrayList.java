package com.java6.oop.genaric;

import com.java6.oop.encapsulation.Person;

import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
        /*ArrayList list = new ArrayList();
        list.add(10);
        list.add(new Person());
        list.add("sss");

        System.out.println(list);
        System.out.println(list.get(0));*/


       /* ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(50);
        integers.add(9);
        integers.add(3);
        integers.add(4);
        integers.add(130);
        System.out.println(integers);

        integers.add(2, 15);
        System.out.println(integers);

        integers.set(4, 100);
        System.out.println(integers);
*/
        /*integers.sort();*/
       /* Collections.sort(integers);
        System.out.println(integers);

        Collections.reverse(integers);
        System.out.println(integers);*/

        /*integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        System.out.println(integers);*/
        /*Integer[] x = {10, 50, 2, 3, 7};
        Arrays.sort(x , new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        for (int ww:x) {
            System.out.println(ww);

        }*/

        /*for (int x:integers) {
            System.out.println(x);

        }*/


        /*ArrayList<Person> people = new ArrayList<>();
        Person p = new Person("Anis", 29);

        people.add(p);
        people.add(new Person("sami", 15));
        people.add(new Person("soso",9));
        people.add(new Person("Rami",60));
        people.add(new Person("Fowzi", 18));
        people.remove(1);
        for (Person pp:people) {
            pp.printData();
        }
        *//*Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        });*//*
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        System.out.println("==================================");
        for (Person pp:people) {
            pp.printData();
        }
        //people.forEach(x -> System.out.println(x));*/


        ArrayList<String> strings = new ArrayList<>();
        strings.add("ali");
        strings.add("sami");
        strings.add("soso");
        strings.add("sami");
        System.out.println(strings.contains("ali"));

        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("sami");
        strings1.add("ali");


        //List<String> strings2 = strings.subList(1, 5);


        strings.clear();
        strings1.isEmpty();
       // Arrays.asList("sami" , "ali")
        strings.removeAll(strings1);
        System.out.println(strings);
    }
}
