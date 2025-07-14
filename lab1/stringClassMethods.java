package com.demo.lab1;

public class stringClassMethods {
    public static void testCharAt(String str) {
        System.out.println("charAt(2): " + str.charAt(2));
    }

    public static void testContains(String str, String search) {
        System.out.println("contains(\"" + search + "\"): " + str.contains(search));
    }

    public static void testLength(String str) {
        System.out.println("length(): " + str.length());
    }

    public static void testIndexOf(String str, String search) {
        System.out.println("indexOf(\"" + search + "\"): " + str.indexOf(search));
    }

    public static void testEquals(String str1, String str2) {
        System.out.println("equals(\"" + str2 + "\"): " + str1.equals(str2));
    }

    public static void testEqualsIgnoreCase(String str1, String str2) {
        System.out.println("equalsIgnoreCase(\"" + str2 + "\"): " + str1.equalsIgnoreCase(str2));
    }

    public static void testJoin() {
        String result = String.join(" - ", "Java", "Python", "C++");
        System.out.println("join(): " + result);
    }

    public static void testLastIndexOf(String str, String search) {
        System.out.println("lastIndexOf(\"" + search + "\"): " + str.lastIndexOf(search));
    }

    public static void testSubstring(String str, int start, int end) {
        System.out.println("substring(" + start + ", " + end + "): " + str.substring(start, end));
    }

    public static void testToLowerCase(String str) {
        System.out.println("toLowerCase(): " + str.toLowerCase());
    }

    public static void testToUpperCase(String str) {
        System.out.println("toUpperCase(): " + str.toUpperCase());
    }

    public static void testTrim(String str) {
        System.out.println("trim(): \"" + str.trim() + "\"");
    }

    public static void main(String[] args) {
        String sample = "  Hello World  ";
        String compare = "hello world";

        System.out.println("Testing on: \"" + sample + "\"\n");

        testCharAt(sample.trim());
        testContains(sample, "World");
        testLength(sample);
        testIndexOf(sample, "o");
        testEquals(sample.trim(), compare);
        testEqualsIgnoreCase(sample.trim(), compare);
        testJoin();
        testLastIndexOf(sample, "l");
        testSubstring(sample.trim(), 0, 5); // "Hello"
        testToLowerCase(sample);
        testToUpperCase(sample);
        testTrim(sample);
    }
}
