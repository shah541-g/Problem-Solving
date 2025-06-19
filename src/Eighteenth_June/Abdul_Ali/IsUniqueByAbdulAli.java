package Eighteenth_June.Abdul_Ali;

import Constants_And_Methods.*;

import java.util.HashSet;
import java.util.Set;

import static Constants_And_Methods.Names.printAbdulAli;

// Problem Number: 1.1
// Problem Name: Is Unique
// Description: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
// Link: https://www.geeksforgeeks.org/determine-string-unique-characters/

public class IsUniqueByAbdulAli {

    public static boolean isUniqueViaBooleanArray(String string){

        boolean[] bitWiseArray = new boolean[128];
        for (char c : string.toCharArray()){

            if(bitWiseArray[(int) c]){
                return false;
            }
            bitWiseArray[(int) c] = true;

        }


        return true;
    }

    public static boolean isUniqueViaSet(String string){

        Set<Character> seen = new HashSet<>();

        for (char c : string.toCharArray()){

            if(!seen.add(c)){
                return false;
            }
        }

        return true;
    }

    private static char[] bubbleSort(String string){

        char[] processedArray = string.toCharArray();

        int length = processedArray.length;

        for (int i=0; i<length-1; i++){

            for(int j = 0; j<length-i-1; j++){
                if(processedArray[j]>processedArray[j+1]){
                    char temp = processedArray[j];
                    processedArray[j] = processedArray[j+1];
                    processedArray[j+1] = temp;
                }
            }
        }

        return processedArray;
    }


    public static boolean isUniqueViaSortedArray(String string){

//        Step 1: Sort They Array
        char[] sortedArray = bubbleSort(string);
        int length = sortedArray.length;

        for(int i = 0; i<length; i++){

//        Step 2: Compare Adjecent Letters
            if(sortedArray[i] == sortedArray[i+1]){
                return false;
            }
        }

        return true;
    }

    private static void printAsciiArt() {
        System.out.println(
        "    ____        __  __      _                \n" +
        "   /  _/____   / / / /___  (_)___ ___  _____ \n" +
        "   / // ___/  / / / / __ \\/ / __ `/ / / / _ \\\n" +
        " _/ /(__  )  / /_/ / / / / / /_/ / /_/ /  __/\n" +
        "/___/____/   \\____/_/ /_/_/\\__, /\\__,_/\\___/ \n" +
        "                             /_/\n"        );
    }

    private static void printQuestion() {
        System.out.println("Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?");
    }

    private static void printSpaces() {
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void runAllAbdulAliSolutions() {
        printAbdulAli();
        printAsciiArt();
        printSpaces();
        printQuestion();
        printSpaces();
        System.out.println(isUniqueViaBooleanArray("Ahmad"));
        System.out.println(isUniqueViaSet("Ahmad"));
        System.out.println(isUniqueViaSortedArray("Ahmad"));


    }
}