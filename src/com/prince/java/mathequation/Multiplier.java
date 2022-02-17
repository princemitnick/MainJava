package com.prince.java.mathequation;

import com.prince.java.mathequation.CalculateBase;

public class Multiplier extends CalculateBase {

    @Override
    public void calculate() {
        double value = getLeftVal() * getRightVal();
        setResult(value);
    }
}
