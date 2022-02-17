package com.prince.java.inheritance;

public abstract class Bike {

    abstract void run();
}

class Honda4 extends Bike {

    int speed;
    {
        speed = 8;
    }
    @Override
     void run() {
        System.out.println("Bike is running at : "+8);
    }

    public static void main(String... args){
        Bike b = new Honda4();
        b.run();
    }
}