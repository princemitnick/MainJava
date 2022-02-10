package com.prince.class_example.java;

public class Person {

    String nom;
    String prenom;
    int age;
    long dob;
    long pob;

    public Person(){
    }

    public Person(String n, String p){
        this.nom = n;
        this.prenom = p;
    }

    public Person(String n, String p, int a){
        this(n,p);
        this.age = a;
    }

    public Person(String n, String p, int a, long dob, long pob){
        this(n,p,a);
        this.dob = dob;
        this.pob = pob;
    }


}

