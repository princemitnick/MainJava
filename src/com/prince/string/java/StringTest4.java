package com.prince.string.java;

public class StringTest4 {

    public static void main(String... args) {

        int iVal = 1234567;

        String s1 = String.format("5d", iVal);
        String s2 = String.format("%,d", iVal);

        System.out.println(s1);
        System.out.println(s2);

    }

}
