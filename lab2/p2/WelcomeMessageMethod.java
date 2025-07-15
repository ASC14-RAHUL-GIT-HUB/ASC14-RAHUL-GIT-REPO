package com.demo.lab2.p2;

public class WelcomeMessageMethod {
    public static String welcomeMessage(String name) {
        return "Hello " + name + ", Welcome to Java World!";
    }

    public static void main(String[] args) {
        String name = "Rahul";
        String message = welcomeMessage(name);
        System.out.println(message);
    }
}
