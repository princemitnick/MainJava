package com.prince.java.mathequation;

public class Divider extends CalculateBase implements MathProcessing {

    public Divider(){}

    public Divider(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() / getRightVal();
        setResult(value);
    }

    @Override
    public String getKeyWord() {
        return "div";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRightVal(rightVal);
        calculate();
        return getResult();
    }
}
