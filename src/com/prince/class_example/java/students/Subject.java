package com.prince.class_example.java.students;

public class Subject {

    String SubjectName;
    double SubjectCoeff;

    public Subject(){}

    public Subject(String subjectName, double subjectCoeff) {
        this.SubjectName = subjectName;
        this.SubjectCoeff = subjectCoeff;
    }

    public String getSubjectName() {
        return SubjectName;
    }

    public void setSubjectName(String subjectName) {
        SubjectName = subjectName;
    }

    public double getSubjectCoeff() {
        return SubjectCoeff;
    }

    public void setSubjectCoeff(int subjectCoeff) {
        SubjectCoeff = subjectCoeff;
    }


}
