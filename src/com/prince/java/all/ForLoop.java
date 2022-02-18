package com.prince.java.all;

public class ForLoop {

    public static void main(String... args) {

        for (int i = 1; i <= 100000; i *= 2) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
