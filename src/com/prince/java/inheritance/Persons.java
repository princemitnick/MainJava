package com.prince.java.inheritance;

public class Persons {

    private String code;
    private String nom;
    private String prenom;

    public Persons(String code, String nom, String prenom) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object obj) {
        if (! (obj instanceof Persons))
            return false;
        Persons persons = (Persons) obj;
        return code == persons.code && nom == persons.nom &&
                prenom == persons.prenom;
    }

}
