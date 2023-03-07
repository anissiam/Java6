package com.java6.oop.basics;

public class StaticLecture {
    private int x;
    private int y;
    static int z;
    public StaticLecture() {
    }
    public StaticLecture(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int getZ() {
        return z;
    }

    public static void setZ(int z) {
        StaticLecture.z = z;
    }
}
