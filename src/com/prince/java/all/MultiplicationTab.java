package com.prince.java.all;

public class MultiplicationTab {

    public static void main(String... args) {
        /**
         * Multiplication Tab 1 to 10;
         */

        int[] factors = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] operators = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int product;
        int operatorIndex;
        int factorIndex;

        for (factorIndex = 0; factorIndex < factors.length; factorIndex++) {
            for (operatorIndex = 0; operatorIndex < operators.length; operatorIndex++) {
                product = factors[factorIndex] * operators[operatorIndex];
                System.out.println("[" + factors[factorIndex] + " x " + operators[operatorIndex] + "] = " + product);
            }

            System.out.println("------------------------");
        }

    }
}
