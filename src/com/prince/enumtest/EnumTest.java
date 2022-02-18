package com.prince.enumtest;

import java.util.Scanner;

public class EnumTest {

    public static void main(String... args) {
        //Jour jour = Jour.JEUDI;
        //displayJour(jour);
        getDay();
    }

    public static void getDay() {
        System.out.println("Entre le jour : ");
        Scanner scanner = new Scanner(System.in);
        String jour = scanner.nextLine().toUpperCase();
        Jour enumJour = Jour.valueOf(jour);
        displayJour(enumJour);
    }

    static void displayJour(Jour jour) {
        switch (jour) {
            case LUNDI:
                System.out.println("Aujourd'hui est Lundi, " + jour.getDesc());
                break;
            case MARDI:
                System.out.println("Aujourd'hui est Mardi, " + jour.getDesc());
                break;
            case MERCREDI:
                System.out.println("Aujourd'hui est Mercredi, " + jour.getDesc());
                break;
            case JEUDI:
                System.out.println("Aujourd'hui est Jeudi, " + jour.getDesc());
                break;
            case VENDREDI:
                System.out.println("Aujourd'hui est Vendredi, " + jour.getDesc());
                break;
            case SAMEDI:
                System.out.println("Aujourd'hui est Samedi, " + jour.getDesc());
                break;
            case DIMANCHE:
                System.out.println("Aujourd'hui est Dimanche, " + jour.getDesc());
                break;
            default:
                System.out.println("You messed it up");
                break;
        }
    }
}


