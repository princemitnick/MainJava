package com.prince.java.all;

import java.util.Objects;

public class PersonEqualTest {

    String nom;
    String prenom;
    int age;

    PersonEqualTest(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    PersonEqualTest(String nom, String prenom, int age) {
        this(nom, prenom);
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonEqualTest that = (PersonEqualTest) o;
        return Objects.equals(nom, that.nom) && Objects.equals(prenom, that.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom);
    }

    public static void main(String... args) {
        PersonEqualTest p1 = new PersonEqualTest("Prince", "Stanley", 1 + 1);
        PersonEqualTest p2 = new PersonEqualTest("Prince", "Stanley");
        PersonEqualTest p3 = new PersonEqualTest("Prince", "Stanley", 2);

        System.out.println("Equals Test");
        boolean test = p1.equals(p3);
        System.out.println(test);
        System.out.println();
        System.out.println("HashCode Test");
        System.out.println("p1 : " + p1.hashCode());
        System.out.println("p3 : " + p3.hashCode());
        System.out.println("p2 : " + p2.hashCode());
        System.out.println();
        System.out.println("GetClass Test");
        System.out.println(p1.getClass());
        System.out.println(p3.getClass());
        System.out.println();

    }
}
