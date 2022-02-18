package com.prince.method.java;

public class CmdLineArg {

    public static void handleCommandLine(String[] args) {

        for (int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }

    public static void main(String... args) {
        handleCommandLine(args);
    }
}
