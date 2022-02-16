package com.prince.java;

public class DummyModel {

    String name;

    public DummyModel(){}

    public DummyModel(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){

        return name;
    }
}
