package com.prince.method.java;

public class Person {

    String nom;
    String prenom;
    int age;

    public Person(String n, String p, int a){
        this.nom = n;
        this.prenom = p;
        this.age = a;
    }

    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }

    public int getAge(){
        return this.age;
    }

    public void setNom(String n){
        this.nom = n;
    }

    public void setPrenom(String p){
        this.prenom = p;
    }

    public void setAge(int a){
        this.age = a;
    }

    public static void main(String... args){
        Person person = new Person("Jean", "Prince", 40);

        System.out.println("Nom: "+person.getNom());
        System.out.println("Prenom: "+person.getPrenom());
        System.out.println("Age: "+person.getAge());

        person.setAge(30);

        System.out.println("New Age : "+person.getAge());

    }
}
