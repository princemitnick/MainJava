package com.prince.java.inheritance;

public class Student extends Person {

    String courses;

    Student(String nom, String prenom, String courses) {
        super(nom, prenom);
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses='" + courses + '\'' +
                '}';
    }
}
