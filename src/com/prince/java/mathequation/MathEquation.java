package com.prince.java.mathequation;

public class MathEquation {

    static {
        int var0 = 10;
        int var1 = 15;
        int var2 = 20;
    }
    double leftVal;
    double rightVal;
    char opCode;
    double result;

    private static int numberOfCalculations;
    private static double sumOfResults;

    public static double getAverageResult(){
        return sumOfResults / numberOfCalculations;
    }

    public double getResult(){
        return this.result;
    }

    public double getLeftVal(){
        return this.leftVal;
    }

    public double getRightVal(){
        return this.rightVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

    public void setResult(double result) {
        this.result = result;
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

    public void execute(){

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

        numberOfCalculations++;
        sumOfResults += result;

    }

    public void execute(double leftVal, double rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
    }

    public void execute(int leftVal, int rightVal){
        this.leftVal = leftVal;
        this.rightVal = rightVal;

        execute();
        result = (int) result;
    }

}
