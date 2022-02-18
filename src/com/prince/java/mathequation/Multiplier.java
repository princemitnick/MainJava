package com.prince.java.mathequation;

import com.prince.java.mathequation.CalculateBase;

public class Multiplier extends CalculateBase implements MathProcessing {

    public Multiplier() {
    }

    public Multiplier(double leftVal, double righVal) {
        super(leftVal, righVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }

    @Override
    public String getKeyWord() {
        return "mult";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {

        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
}
