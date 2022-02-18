package com.prince.exception.java;

public class ExceptionTest1 {

    public static void main(String... args) {

        try {
            int k = 0;
            int n = 4;

            System.out.println(n / k);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Fais pas le con");
        }
    }
}
