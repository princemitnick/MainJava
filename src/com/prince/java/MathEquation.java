package com.prince.java;

public class MathEquation {

    double leftVal;
    double rightVal;
    char opCode;
    double result;

    public double getResult(){
        return this.result;
    }

    public double getLeftVal(){
        return this.leftVal;
    }

    public double getRightVal(){
        return this.rightVal;
    }

    public MathEquation(){}

    public MathEquation(char opCode){
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    void execute(){

        switch (opCode){
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invalid opCode: "+ opCode);
                break;
        }
    }
}
