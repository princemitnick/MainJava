package com.prince.java.all;

import java.util.Scanner;

public class ConditionnalLogic2 {

    public static void main(String... args){
        double value2 = 100.0d;
        double value1 = 450.0d;
        double result = 0.0d;
        char opChar;
        Scanner sc = new Scanner(System.in);
        System.out.println("> Enter one of those characters : a,s,m,d");
        opChar = sc.next().charAt(0);

        if (opChar == 'a')
            result = value1 + value2;
        else if(opChar == 's')
            result = value1 - value2;
        else if (opChar == 'm')
            result = value1 * value2;
        else if (opChar == 'd')
            result = value1 / value2;

        System.out.println(result);
    }
}
