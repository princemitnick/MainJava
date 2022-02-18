package com.prince.class_example.java.students;

public class Notes {

    Subject subject;
    double note;

    public Notes() {
    }

    public Notes(Subject subject, double note) {
        this.subject = subject;
        this.note = note;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public double getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
