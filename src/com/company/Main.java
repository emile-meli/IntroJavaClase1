package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Ejercicio 1 TM

        System.out.println("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        Ejercicio1.pairPrinter(n);

        //Ejercicio 2 TM

        System.out.println("Ingrese n: ");
        n = scanner.nextInt();

        System.out.println("Ingrese m: ");
        int m = scanner.nextInt();

        Ejercicio2.showMultiples(n,m);

        //Ejercicio 3 TM

        System.out.println("Ingrese n: ");
        n = scanner.nextInt();
        Ejercicio3.checkIfPrime(n);

        //Ejercicio 4 TM

        System.out.println("Ingrese la cantidad de números primos a imprimir: ");
        n = scanner.nextInt();
        Ejercicio4.primeNumberPrinter(n);

        //Ejercicio 5 TM
        System.out.println("Ingrese n: ");
        n = scanner.nextInt();
        System.out.println("Ingrese m: ");
        m = scanner.nextInt();
        System.out.println("Ingrese d: ");
        String d = scanner.next();
        Ejercicio5.digitFinder(n,m,d);

        scanner.close();

    }
}
