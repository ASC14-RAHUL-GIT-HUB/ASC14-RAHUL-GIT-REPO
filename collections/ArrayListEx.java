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

    //boxing
    int primitiveInt = 10;
    Integer boxedInt = Integer.valueOf(primitiveInt); // explicit boxing
//  numberList.add(primitiveInt); // auto boxing

    public static void playingWithArrayLists() {
        ArrayList<String> shoppingCartList = new ArrayList<String>();

        shoppingCartList.add("Man's search for meaning");
        shoppingCartList.add("Start with why");
        shoppingCartList.add("Java");
        shoppingCartList.add(null);
        shoppingCartList.add(null);
        shoppingCartList.add("Deep Work");

        for (String item : shoppingCartList) {
            System.out.println(item);
        }

        System.out.println(   );
    }

}

//collections are part of java framework