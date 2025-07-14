package com.demo.lab1;

public class multiplicationTable {
    public static void multiplicationTableFor(int number) {
        System.out.println("Using for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void multiplicationTableWhile(int number) {
        System.out.println("Using while loop:");
        int i = 1;
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }
    }

    public static void multiplicationTableDoWhile(int number) {
        System.out.println("Using do-while loop:");
        int i = 1;
        do {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        } while (i <= 10);
    }

    public static void main(String[] args) {
        int inputNumber = 2;

        multiplicationTableFor(inputNumber);
        System.out.println(); // spacer

        multiplicationTableWhile(inputNumber);
        System.out.println(); // spacer

        multiplicationTableDoWhile(inputNumber);
    }
}
