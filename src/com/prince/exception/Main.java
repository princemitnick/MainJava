package com.prince.exception;

import com.prince.java.mathequation.MathOperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String... args){
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            String inputLine = null;
            while((inputLine = reader.readLine()) != null)
                performOperation(inputLine);

        }catch (Exception ex){
            System.out.println("Error: "+ ex.getMessage());

        }
    }


    public static void performOperation(String inputLine){
        String [] parts = inputLine.split(" ");
        MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());
        int leftVal = valueFromWord(parts[1]);
        int righVal = valueFromWord(parts[2]);

        int result = execute(operation, leftVal, righVal);
        System.out.println(inputLine + " = " + result);
    }

    private static int execute(MathOperation operation, int leftVal, int righVal) {

        int result = 0;
        switch (operation){
            case ADD:
                result = leftVal + righVal;
                break;
            case SUBSTRACT:
                result = leftVal - righVal;
                break;
            case MULTIPLY:
                result = leftVal * righVal;
                break;
            case DIVIDE:
                result = leftVal / righVal;
                break;
        }
        return result;
    }

    static int valueFromWord(String word) {
        String[] numberWords = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        int value = -1;
        for(int index = 0; index < numberWords.length; index++) {
            if(word.equals(numberWords[index])) {
                value = index;
                break;
            }
        }
        if(value == -1)
            value = Integer.parseInt(word);

        return value;
    }

}
