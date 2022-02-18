package com.prince.java.all;

public class ArrayLogic2 {

    public static void main(String... args) {
        double[] leftVals = {100.0d, 25.0d, 35.0d, 84.04d};
        double[] rightVals = {55.0d, 75.0d, 80.4d, 28.4d};
        double[] result;

        if (leftVals.length != rightVals.length) {
            System.out.println("This operation is impossible");
        } else {
            result = new double[leftVals.length];
            for (int i = 0; i < leftVals.length; i++)
                result[i] = leftVals[i] + rightVals[i];

            for (int index = 0; index < result.length; index++)
                System.out.println("[" + leftVals[index] + " + " + rightVals[index] + "] = " + result[index]);
        }

    }

}
