package com.prince.java.mathequation;

public class Substracter extends CalculateBase {

    public Substracter(){}
    public Substracter(double leftVal, double righVal){super(leftVal,righVal);}

    @Override
    public void calculate() {
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
