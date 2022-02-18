package com.prince.string.java;

public class StringBuilderTest1 {

    public static void main(String... args) {

        StringBuilder sb = new StringBuilder();

        String location = "Florida";
        int flightNumber = 175;

        sb.append("I flew to ");
        sb.append(location);
        sb.append(" on Flight #");
        sb.append(flightNumber);

        System.out.println(sb);

        String message = sb.toString();
        System.out.println(message);

        int pos = sb.indexOf(" on");

        sb.insert(pos, " at 9 PM ");
        //


        System.out.println(pos);

        System.out.println(sb);

        // Reverse string


        String s4 = sb.reverse().toString();


        //
        String s5 = sb.toString();
        String s6 = "";

        System.out.println(s5.length() - 1);

        for (int index = s5.length() - 1; index >= 0; index--)
            s6 = s5.charAt(index) + s6;

        System.out.println("Show - with charArt method");
        System.out.println(s6);

        System.out.println("Show with reverse method");
        System.out.println(s4);


        /**
         * Convert String to String Builder
         *
         */

        String s7 = "Bonjour tout le monde. Mon nom est Garry";

        StringBuilder s7b = new StringBuilder(s7);

        System.out.println(s7b);
        System.out.println(s7b.reverse());


    }
}
