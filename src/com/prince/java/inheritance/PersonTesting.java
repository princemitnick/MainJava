package com.prince.java.inheritance;

import java.util.Objects;

public final class PersonTesting {

    private String code;
    private String nom;
    private String prenom;

    public PersonTesting(String code, String nom, String prenom) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonTesting persons = (PersonTesting) o;
        return code.equals(persons.code) && nom.equals(persons.nom) && prenom.equals(persons.prenom);
    }

    /*  @Override
        public boolean equals(Object obj) {
            if (! (obj instanceof Persons))
                return false;
            Persons persons = (Persons) obj;
            return code == persons.code && nom == persons.nom &&
                    prenom == persons.prenom;
        }
    */
    public static void main(String... args) {
        PersonTesting p = new PersonTesting("001", "P", "S");
        PersonTesting p2 = new PersonTesting("001", "P", "S");

        System.out.println(p.equals(p2));
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, nom, prenom);
    }
}
