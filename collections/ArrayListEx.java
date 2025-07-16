package com.demo.collections;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        rawtypes();
        genericTypes();
        integerNumber();
        numberNumber();
    }

    private static void rawtypes() {

        ArrayList colorsList = new ArrayList();
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add(null);
        ArithmeticException arithmeticException = new ArithmeticException("Sample Exception");
        colorsList.add(arithmeticException);

        System.out.println(colorsList);

    }

    private static void genericTypes() {
        ArrayList<String> colorsList = new ArrayList<String>();
        colorsList.add("Red");
        colorsList.add("Green");
        colorsList.add("Blue");
        colorsList.add(null);

        ArithmeticException arithmeticException = new ArithmeticException("Sample Exception");
        // shows type safety
        // colorsList.add(arithmeticException);

        // workaround
        colorsList.add(arithmeticException.toString());

        System.out.println(colorsList);
    }

    private static void integerNumber() {
        ArrayList<Integer> integerList = new ArrayList<Integer>();
        integerList.add(24);
        integerList.add(57);
        integerList.add(75);
        integerList.add(null);

        ArithmeticException arithmeticException = new ArithmeticException("Sample Exception");
        // shows type safety - workaround
        integerList.add(arithmeticException.hashCode());

        System.out.println(integerList);
    }

    private static void numberNumber() {
        ArrayList<Number> numberList = new ArrayList<Number>();
        numberList.add(24);
        numberList.add(57.09);
        numberList.add(75.7f);
        numberList.add(null);

        ArithmeticException arithmeticException = new ArithmeticException("Sample Exception");
        // shows type safety
        numberList.add(arithmeticException.hashCode());

        System.out.println(numberList);
    }
}

//collections are part of java framework