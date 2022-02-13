package com.prince.serialization_o.java;

import java.io.Serializable;

public class Person implements Serializable {

    public String name;
    public int age;

    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String status = null;
        if (this.age < 18)
            status = "Mineur";
        else
            status = "Majeur";

        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", status: "+status+ '}';
    }
}
