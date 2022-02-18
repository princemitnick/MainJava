package com.prince.java.mathequation;

public class Adder extends CalculateBase {

    public Adder(){}
    public Adder(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }

    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }
}
