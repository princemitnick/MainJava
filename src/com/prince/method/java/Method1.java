package com.prince.method.java;

public class Method1 {

    static void doSomething() {
        System.out.println("Hello Guys");
    }

    static void doAddition(int a, int b) {
        System.out.println(a + b);
    }

    static int doSubstration(int a, int b) {
        return a - b;
    }

    public static void main(String... args) {
        doSomething();
        doAddition(5, 3);
        System.out.println(doSubstration(5, 3));
    }


}
