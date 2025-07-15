package com.demo.access_modifiers.p1;

class P1C1 {
    // instance variable
    private String privateVar;

    private void privateMethod() {
        System.out.println(privateVar);
    }

    public static void main(String[] args) {
        P1C1 p1C1 = new P1C1();
        System.out.println(p1C1.privateVar);
        p1C1.privateMethod();
    }
}