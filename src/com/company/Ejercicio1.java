package com.company;

import java.util.Scanner;

public class Ejercicio1 {

    public static void pairPrinter(int n){
        int i = 0;
        int j = 1;
        System.out.println("Los primeros " + n + " números pares son:");
        while(i < n){
            if(j%2 == 0){
                System.out.println(j);
                i++;
            }
            j++;
        }
    }
}
