package com.prince.exception.java;

public class ExceptionTest2 {

    public static void main(String... args){
        int i = 12;
        int j = 2;
        try {
            int result = i / (j - 2);
        }

        catch (ArithmeticException aex){
            System.out.println(aex.getMessage());
        }

    }
}

