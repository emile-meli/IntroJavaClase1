package com.company;

import java.util.Scanner;

public class Ejercicio3 {

    public static void checkIfPrime(int n) {

        boolean isPrime = true;
        for(int i = 2; i < n; i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(n + " es un número primo");
        }else{
            System.out.println(n + " no es un número primo");
        }
    }

}
