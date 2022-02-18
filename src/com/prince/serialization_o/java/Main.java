package com.prince.serialization_o.java;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String... args) {
        List<Person> people = new ArrayList<>();

        Person p0 = new Person("Prince", 17);
        Person p1 = new Person("Stanley", 25);
        Person p2 = new Person("Joseph", 45);

        System.out.println("Add people to list");
        addPersonToList(people, p0);
        addPersonToList(people, p1);
        addPersonToList(people, p2);
        System.out.println();

        System.out.println("Write people list to an extrenal file 'data.bin'");
        writeToFile(people);
        System.out.println();

        System.out.println("Read people list from the external file 'data.bin'");
        readFile();

    }

    public static void writeToFile(List<Person> list) {

        try (ObjectOutputStream objostr = new ObjectOutputStream(new FileOutputStream("data.bin"))) {
            objostr.writeObject(list);
            objostr.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() {

        try (ObjectInputStream objistr = new ObjectInputStream(new FileInputStream("data.bin"))) {

            List<Person> list = (List) objistr.readObject();
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).toString());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void addPersonToList(List<Person> list, Person p) {
        list.add(p);
    }

    public static void showListOfPerson(List<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

}
