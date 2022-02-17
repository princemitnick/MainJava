package com.prince.java.all;
import java.util.Scanner;

public class ConditionnalLogic
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("> Entrez un chiffre: ");
        int ch = scanner.nextInt();

        if (ch == 0){
            System.out.println("La valeur est nulle");
        }
        else{
            System.out.println("Good");
        }

        int value1 = 7;
        int value2 = 5;

        int maxValue = value1 > value2 ? value1 : value2;
        System.out.println(maxValue);
    }
}
