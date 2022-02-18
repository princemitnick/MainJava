package com.prince.string.java;

public class StringTest3 {

    public static void main(String... args) {

        double david = 17d;
        int dawson = 15;
        int dillon = 8;
        int gordon = 6;

        //Concatenation
        String s1 = "My nephews are " + david + ", " + dawson + ", " + dillon + ", and " + gordon + " years old.";

        //Formatting
        String s2 = String.format("My nephews are %d, %d, %d, and %d years old.", david, dawson, dillon, gordon);

        System.out.println(s1);
        System.out.println(s2);

        System.out.printf("David : %4d%n", david);
    }
}
