package com.prince.java.all;

import java.util.ArrayList;
import java.util.List;

public class DummyModelMain {

    public static void main(String... args) {
        List<DummyModel> dummyModelList = new ArrayList<>();

        DummyModel dm1 = new DummyModel("Jean");
        DummyModel dm2 = new DummyModel("Pierre");
        DummyModel dm3 = new DummyModel("Jacqies");
        DummyModel dm4 = new DummyModel("Amdre");
        DummyModel dm5 = new DummyModel("Phillipes");
        DummyModel dm6 = new DummyModel("Thomas");
        DummyModel dm7 = new DummyModel("Paul");

        dummyModelList.add(dm1);
        dummyModelList.add(dm2);
        dummyModelList.add(dm3);
        dummyModelList.add(dm4);
        dummyModelList.add(dm5);
        dummyModelList.add(dm6);
        dummyModelList.add(dm7);

        dummyModelList.forEach(System.out::println);

    }

}
