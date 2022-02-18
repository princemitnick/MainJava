package com.prince.java.mathequation;

import com.prince.java.mathequation.CalculateBase;

public class Multiplier extends CalculateBase {

    public Multiplier(){}

    public Multiplier(double leftVal, double righVal){super(leftVal,righVal);}

    @Override
    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }
}
