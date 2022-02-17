package com.prince.java.all;

public class ArrayLogic {

    public static void main(String... args){
        int [] intTab = new int[10];

        intTab = new int[40];

        for (int i=0; i<intTab.length; i++)
            intTab[i] = (i+1)*2;

        for (int i=0; i<intTab.length; i++)
            System.out.println(intTab[i]);
    }
}
