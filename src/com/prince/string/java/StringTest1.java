package com.prince.string.java;

public class StringTest1 {

    public static void main(String... args){
        String s1 = "I Love";
        s1 += " Java";
        String s2 = "I";
        s2 += " love Java";

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1 == s2);
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = s1.intern();

        System.out.println(s3);
        System.out.println(s1 == s3);

        String s4 = s2.intern();
        System.out.println(s4);

        System.out.println(s4 == s3);
    }
}
