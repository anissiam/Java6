package com.java6.oop.student;

public class Student extends Person{
    private String major;
    private int hCount;
    private int hPrice;

    public Student() {
    }

    public Student(String major, int hCount, int hPrice) {
        this.major = major;
        this.hCount = hCount;
        this.hPrice = hPrice;
    }

    public Student(int id, String name, int age, String major, int hCount, int hPrice) {
        super(id, name, age);
        this.major = major;
        this.hCount = hCount;
        this.hPrice = hPrice;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int gethCount() {
        return hCount;
    }

    public void sethCount(int hCount) {
        this.hCount = hCount;
    }

    public int gethPrice() {
        return hPrice;
    }

    public void sethPrice(int hPrice) {
        this.hPrice = hPrice;
    }

    public double total(){
        return hCount * hPrice;
    }

    @Override
    public void print() {
        System.out.println(super.toString());
    }

    @Override
    public String toString() {
        print();
        return "Student{" +
                "major='" + major + '\'' +
                ", hCount=" + hCount +
                ", hPrice=" + hPrice +
                '}';
    }
}
