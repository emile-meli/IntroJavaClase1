package com.company;

import java.util.Scanner;

public class Ejercicio4 {

    public static void primeNumberPrinter(int n) {

        int count = 0;
        int currentNumber = 2;
        boolean isPrime = true;

        while(count < n) {
            isPrime = true;
            for (int i = 2; i < currentNumber; i++) {
                if (currentNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                System.out.println(currentNumber);
            }
            currentNumber++;
        }
    }
}
