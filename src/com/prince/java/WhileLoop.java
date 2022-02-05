package com.prince.java;

public class WhileLoop {

    public static void main(String... arg){
        int someValue = 4;
        int factorial = 1;

        while(someValue > 1){
            factorial *= someValue;
            someValue--;
        }

        System.out.println(factorial);

        int iVal = 80;

        do{
            System.out.println(iVal);
            System.out.println(" * 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        }while(iVal < 25);
    }
}
