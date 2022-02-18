package com.prince.java.mathequation;

public interface MathProcessing {

    String SEPARATOR = " ";
    String getKeyWord();
    double doCalculation(double leftVal, double rightVal);
}
