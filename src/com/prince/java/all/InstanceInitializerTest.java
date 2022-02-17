package com.prince.java.all;


public class InstanceInitializerTest {

    int speed;
    String var1;
    static String var2;
    static String var3;

    InstanceInitializerTest(){
        System.out.println("(Constr).. Hello");
    }

    {
        speed = 80;
        var1 = "Test";
        var2 = "Static element";
    }

    {
        System.out.println("1(NS). Hello. This is an instance initializer block");
        System.out.println("Speed is : "+speed+" "+var1+" "+var2);
        System.out.println();
    }

    static {
        var3 = String.valueOf(400);
        System.out.println("3. Hello. This is an instance initializer static block : "+var3);
        System.out.println();
    }



    static {
        var3 = String.valueOf(800);
        System.out.println("2. Hello. This is an instance initializer static block : "+var3);
        System.out.println();
    }



    static {
        var3 = String.valueOf(4500);
        System.out.println("4. Hello. This is an instance initializer static block : "+var3);
        System.out.println();
    }

    static {
        var3 = String.valueOf(800);
        System.out.println("1. Hello. This is an instance initializer static block : "+var3);
        System.out.println();
    }

    public static void main(String... args){
        InstanceInitializerTest t1 = new InstanceInitializerTest();
     //   InstanceInitializerTest t2 = new InstanceInitializerTest();
    }
}
