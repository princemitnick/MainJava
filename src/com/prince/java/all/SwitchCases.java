package com.prince.java.all;

public class SwitchCases {

    public static void main(String... args){
        double value1 = 500d;
        double value2 = 100d;
        double result = 0.0d;
        char opCode = 'd';


        switch (opCode){
            case 'a':
                result = value1 + value2;
                break;
            case 's':
                result = value1 - value2;
                break;
            case 'm':
                result = value1 * value2;
                break;
            case 'd':
                result = value1 / value2;
                break;
            default:
                System.out.println("Invalid opCode: "+opCode);
                result = 0.0d;
        }
        System.out.println(result);

    }
}
