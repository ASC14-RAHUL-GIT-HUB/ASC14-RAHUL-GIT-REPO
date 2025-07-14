package com.demo.lab1;

public class methodOverloading {
    public int add(int a, int b) {
        return a+b;
    }

    public int add(int a, int b, int c) {
        return a+b+c;
    }

    public int add(int a, int b, int c, int d) {
        return a+b+c+d;
    }

    public String add(String a, String b) {
        return a + " " + b;
    }

    public static void main(String[] args) {
        methodOverloading ops = new methodOverloading();
        System.out.println(ops.add(2,3));
        System.out.println(ops.add(2,3,4));
        System.out.println(ops.add(2,3,4,5));
        System.out.println(ops.add("Rahul", "V B"));
    }
}
