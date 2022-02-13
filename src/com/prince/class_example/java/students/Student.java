package com.prince.class_example.java.students;

public class Student {

    int id;
    String lastName;
    String firstName;

    public Student(){}

    public Student(int it, String lastName, String firstName){
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastname='" + lastName + '\'' +
                ", firstname='" + firstName + '\'' +
                '}';
    }
}
