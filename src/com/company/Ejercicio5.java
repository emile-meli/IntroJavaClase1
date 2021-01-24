package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio5 {

    public static void digitFinder(int n, int m, String d) {

        int count = 0;
        int currentNumber = 0;
        //int charCount = 0;
        //Regex creation
        String regex = ".*[";
        for(int i = 0; i < d.length(); i++){
            regex += d.charAt(i) + "]" + (i==d.length()-1?"":"[");
        }
        regex += "{" + m + "}.*";
        Pattern pattern = Pattern.compile(regex);
        while (count < n) {
/*                for(char numberChar : Integer.toString(currentNumber).toCharArray()){
                if(dChar == numberChar){
                    charCount++;
                }
            }
            if(charCount >= m){
                count++;
                System.out.println(currentNumber);
            }
            charCount = 0;
            currentNumber++;
        }
*/
            if (pattern.matcher(Integer.toString(currentNumber)).matches()) {
                count++;
                System.out.println(currentNumber);
            }
            currentNumber++;
        }
    }
}
