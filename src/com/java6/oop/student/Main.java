package com.java6.oop.student;

import java.util.Scanner;

public class Main {
    private static Student[] studentArray = new Student[10];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "Hello");

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("1.Add Student\n2.Show student\n3.Show all Student\n4.Delete student\n5.Exit");*/
        //int c = scanner.nextInt();

        //String s =  JOptionPane.showInputDialog("1.Add Student\n2.Show student\n3.Show all Student\n4.Delete student\n5.Exit");
        int c;
        do {
            System.out.println("==================================================================");
            System.out.println("1.Add Student\n2.Show student\n3.Show all Student\n4.Delete student\n5.Exit");
            c = scanner.nextInt();
            switch (c) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudent();
                    break;
                case 3:
                    showAllStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                default:
                    System.exit(0);
                    break;
            }
        } while (c != 6);
    }

    private static void deleteStudent() {
        System.out.println("Plz enter id");
        int id = scanner.nextInt();
        if (studentArray[id] != null) {
            studentArray[id] = null;
            System.out.println("Deleted");
        } else {
            System.out.println("Student not found");

        }
    }

    private static void showStudent() {
        System.out.println("Plz enter id");
        int id = scanner.nextInt();
        if (studentArray[id] != null) {
            Student student = studentArray[id];
            System.out.println(student.toString());
            studentOption(student);

        } else {
            System.out.println("Student not found");

        }
    }

    private static void studentOption(Student student) {
        int c;
        do {
            System.out.println("1.Show total \n2.Update name\n3.Exit");
            c = scanner.nextInt();
            switch (c) {
                case 1:
                    System.out.println(student.total());
                    break;
                case 2:
                    updateName(student);
                    break;
                default:
                    break;
            }
        } while (c != 3);
    }

    private static void updateName(Student student) {
        scanner.nextLine();
        System.out.println("Plz add Name");
        String name = scanner.nextLine();
        student.setName(name);
    }

    private static void showAllStudent() {
        for (int i = 0; i < studentArray.length; i++) {
            if (studentArray[i] != null) {
                System.out.println(studentArray[i].toString());
            }
            System.out.println("--------------------------------");
        }
    }

    private static void addStudent() {
        System.out.println("Plz add id");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Plz add Name");
        String name = scanner.nextLine();

        System.out.println("Plz add age");
        int age = scanner.nextInt();

        String[] majors = {"IT", "CS", "Math", "AI"};
        for (int i = 1; i <= majors.length; i++) {
            System.out.print(i + ")" + majors[i - 1] + " ");
        }
        System.out.println("Plz chose major");
        int i = scanner.nextInt();
        String major = majors[i - 1];

        System.out.println("Plz add Hour count");
        int h = scanner.nextInt();

        System.out.println("Plz add Hour Price");
        int p = scanner.nextInt();


        Student student = new Student(id, name, age, major, h, p);

        studentArray[id] = student;


    }
}
