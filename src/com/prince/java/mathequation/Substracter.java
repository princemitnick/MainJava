package com.prince.java.mathequation;

public class Substracter extends CalculateBase implements MathProcessing {

    public Substracter() {
    }

    public Substracter(double leftVal, double righVal) {
        super(leftVal, righVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }

    @Override
    public String getKeyWord() {
        return "subs";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
}
