package com.prince.method.java;

public class Method2 {

    static void showSum(float x, float y, int count, String... args) {
        args = new String[]{"Bonjour", "Mesdames", "et", "Messieurs"};
        float sum = x + y;
        int index = 0;

        /*if (count < 1)
            return;
         */
        for (int i = 0; i < count; i++)
            System.out.println(sum);

        handleCommandLine(args);

        do {

            System.out.println(args[index]);
            index++;

        } while (index != args.length);

    }

    private static void handleCommandLine(String[] args) {
    }

    public static void main(String... args) {
        showSum(4, 5, -9);
    }
}
