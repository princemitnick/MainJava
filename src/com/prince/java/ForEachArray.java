package com.prince.java;

public class ForEachArray {


    public static void main(String... args){
        double [] leftVals = {100.4d, 804.5d, 203.6d, 45.6d, 130.2d};
        String [] names = {"Jean", "Baptiste", "Prince", "Stanley", "Lovensky", "J"};

        for (double result: leftVals
             ) {
            System.out.println(result);
        }

        for (
                String name: names
        ){
            System.out.println(name);
        }
    }


}
