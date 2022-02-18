package com.prince.class_example.java;

public class Person {

    String nom;
    String prenom;
    int age;
    long dob;
    long pob;

    public Person() {
    }

    public Person(String n, String p) {
        this.nom = n;
        this.prenom = p;
    }

    static void equation() {
        System.out.println(4.0f + 23.0d);
        StaticVarTest1.st1 = "World!";
    }

    public Person(String n, String p, int a) {
        this(n, p);
        this.age = a;
    }

    public Person(String n, String p, int a, long dob, long pob) {
        this(n, p, a);
        this.dob = dob;
        this.pob = pob;
    }

    public static void main(String... args) {
        Person p = new Person();
        Person p2 = new Person("Jean", "Prince");
        Person p3 = new Person(p2.nom, p2.prenom, 234234);

        Person.equation();
        System.out.println(StaticVarTest1.st1);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

