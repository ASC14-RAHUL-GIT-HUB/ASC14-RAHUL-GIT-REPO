package com.demo.lab1;

public class wordCount {
    public static int countWords(String input) {
        if (input == null || input.trim().isEmpty()) {
            return 0;
        }

        String[] words = input.trim().split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {
        String input = "Sum of 12 and 20 is 32";

        int wordCount = countWords(input);

        System.out.println("Input: \"" + input + "\"");
        System.out.println("Word Count: " + wordCount);
    }
}
