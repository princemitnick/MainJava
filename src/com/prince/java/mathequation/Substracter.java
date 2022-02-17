package com.prince.java.mathequation;

public class Substracter extends CalculateBase {

    @Override
    public void calculate() {
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }
}
