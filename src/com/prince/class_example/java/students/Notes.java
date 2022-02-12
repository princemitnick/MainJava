package com.prince.class_example.java.students;

public class Notes {

    Subject subject;
    int note;

    public Notes(){}

    public Notes(Subject subject, int note) {
        this.subject = subject;
        this.note = note;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
