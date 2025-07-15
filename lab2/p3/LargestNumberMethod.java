package com.demo.lab2.p3;

public class LargestNumberMethod {
    public static int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 40;
        int num3 = 30;

        int max = largest(num1, num2, num3);
        System.out.println("The largest number is: " + max);
    }
}
