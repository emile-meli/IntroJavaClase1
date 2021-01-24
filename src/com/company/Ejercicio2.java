package com.company;

import java.util.Scanner;

public class Ejercicio2 {

    public static void showMultiples(int n, int m) {
        System.out.println("Los primeros " + n + " múltiplos de " + m + " son:");
        for (int i = 1; i < n + 1; i++) {
            System.out.println(i * m);
        }
    }
}
