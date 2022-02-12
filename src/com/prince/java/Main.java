package com.prince.java;

import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {
	// write your code here
        performCalculations();
    }

    static void performCalculations(){
        MathEquation [] equations = new MathEquation[4];

        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);

        for (MathEquation equation: equations){
            equation.execute();
            System.out.println("result = " + equation.getResult());
        }

        System.out.println("Average result = "+MathEquation.getAverageResult());

        System.out.println();
        System.out.println("Using execute overloads");
        System.out.println();

        MathEquation equationOverload = new MathEquation('d');
        double leftDouble = 9.0d;
        double righDouble = 4.0d;

        equationOverload.execute(leftDouble, righDouble);

        System.out.println("Overloaded result with double : "+equationOverload.getResult());

        int leftInt = 9;
        int righInt = 4;

        equationOverload.execute(leftInt, righInt);
        System.out.println("Overloaded result with ints: "+equationOverload.getResult());
    }


}
