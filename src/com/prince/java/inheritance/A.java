package com.prince.java.inheritance;

public interface A {

    void a();
    void b();
    void c();
    void d();

}

abstract  class B implements  A{
    public void c(){
        System.out.println("I'm c");
    }
    abstract  void e();

}

class M extends B {

    @Override
    public void a() {
        System.out.println("I'm a");
    }

    @Override
    public void b() {
        System.out.println("I'm b");
    }

    @Override
    public void d() {
        System.out.println("I'm c");
    }
    @Override
    public void e() {
        System.out.println("I'm e");
    }
}

class Test4{
    public static void main(String... args){
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
        ((M) a).e();
    }
}
