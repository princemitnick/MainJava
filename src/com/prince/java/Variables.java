package com.prince.java;

public class Variables {

    public static  void main(String... args){
        int myVar;
        myVar = 50;
        final int test = 40;
        System.out.println(myVar);

        int anotherVar  = 100;
        System.out.println(anotherVar);

        myVar = anotherVar;

        System.out.println(myVar);

        System.out.println(test);
        myVar = 1;
        int newVar = ++myVar;
        System.out.println(++newVar);

        newVar = 70;
        newVar -= 9;

        newVar += 4 * 12;
        System.out.println(newVar);
    }

}
