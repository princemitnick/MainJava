package com.prince.class_example.java.students;

public class Bulletin {

    public void calculateAverage(Student student, Subject subject, Notes [] notes){

        student = new Student(1, "Jean Baptiste", "Prince");


    }

    public Subject [] addSubject(){

        Subject [] subject = new Subject[4];

        subject [0] = new Subject("Math-001", 100.0d);
        subject [1] = new Subject("Stat-001", 100.0d);
        subject [2] = new Subject("Prog-001", 100.0d);
        subject [3] = new Subject("System-001", 200.0d);
        subject [4] = new Subject("Networking-001", 200.0d);
        return  subject;
    }

    public Notes [] studentNotes(){

        Subject [] subjects = addSubject();
        Notes [] notes = new Notes[subjects.length];





        return notes;

    }
}
