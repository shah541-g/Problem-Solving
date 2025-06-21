package Nineteenth_June.Abdul_Ali;

import Constants_And_Methods.*;

import java.util.Arrays;

import static Constants_And_Methods.Names.printAbdulAli;

// Problem Number: 1.2
// Problem Name: Check Permutation
// Description: Given two strings, write a method to decide if one is a permutation of the other.
// Link: https://www.geeksforgeeks.org/check-if-two-strings-are-permutation-of-each-other/

public class CheckPermutationByAbdulAli {

    private static char[] sort(String string){

        char[] sortedString = string.toCharArray();
        java.util.Arrays.sort(sortedString);
        return sortedString;
    }
    private static boolean isPermutationBySorting(String actualString, String candidatePermutation){

        if(actualString.length() != candidatePermutation.length()){
            return false;
        }
        return Arrays.equals(sort(actualString), sort(candidatePermutation));
    }

    private static boolean isPermutationViaParsing(String actualString, String candidatePermutation){

        if(actualString.length() != candidatePermutation.length()){
            return false;
        }

        StringBuilder candidatePermutationStringBuilder = new StringBuilder(candidatePermutation);
        for(char character: actualString.toCharArray()){
            boolean isFound = false;
            for(int i=0;i<candidatePermutationStringBuilder.length();i++){
                if(candidatePermutationStringBuilder.charAt(i) == character){
                    candidatePermutationStringBuilder.setCharAt(i,' ');
                    isFound = true;
                    i = candidatePermutation.length()+1;
                }
            }
            if(!isFound){
                return false;
            }
        }

        return true;
    }

    private static boolean isPermutationForNonRepeating(String actualString, String candidatePermutation){
        if(actualString.length()!=candidatePermutation.length()){
            return false;
        }
        boolean[] bitWiseArray = new boolean[26];
        for(char c: actualString.toCharArray()){
            if(c>=97){
                bitWiseArray[(c - 97) % 26] = true;
            }
            else {
                bitWiseArray[(c - 65) % 26] = true;
            }
        }
        for(char c: candidatePermutation.toCharArray()){

            if(c>=97){
                if(bitWiseArray[(c-97)%26]){
                    bitWiseArray[(c-97)%26] = true;
                }
                else{
                    return false;
                }
            }
            else{
                if(bitWiseArray[(c-65)%26]){
                    bitWiseArray[(c-65)%26] = true;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isPermutationByCountingCharacters(String actualString, String candidatePermutation){
        if(actualString.length()!=candidatePermutation.length()){
            return false;
        }
        int[] letters = new int[128];

        for(char c: actualString.toCharArray()){
            letters[c]++;
        }
        for(char c: candidatePermutation.toCharArray()){
            letters[c]--;
            if(letters[c]<0){
                return false;
            }
        }

        return true;
    }

    public static void printAscii(){
        System.out.println(" ____                           _        _   _              ____ _          \n" +
                "|  _ \\ ___ _ __ _ __ ___  _   _| |_ __ _| |_(_) ___  _ __  / ___| |__   ___ \n" +
                "| |_) / _ \\ '__| '_ ` _ \\| | | | __/ _` | __| |/ _ \\| '_ \\| |   | '_ \\ / _ \\\n" +
                "|  __/  __/ |  | | | | | | |_| | || (_| | |_| | (_) | | | | |___| | | |  __/\n" +
                "|_|   \\___|_|  |_| |_| |_|\\__,_|\\__\\__,_|\\__|_|\\___/|_| |_|\\____|_| |_|\\___|\n" +
                "  ___| | _____ _ __                                                         \n" +
                " / __| |/ / _ \\ '__|                                                        \n" +
                "| (__|   <  __/ |                                                           \n" +
                " \\___|_|\\_\\___|_|                                                           ");
    }
    public static void runAllAbdulAliSolutions(){

        printAscii();
        System.out.println();
        System.out.println();
        System.out.println();
        String actualString = "name";
        String permutedString = "mena";
        boolean result1 = isPermutationBySorting(actualString,permutedString);
        System.out.println("Checking Permutation Via Sorting: " + result1);
        boolean result2 = isPermutationViaParsing(actualString,permutedString);
        System.out.println("Checking Permutation Via Parsing through the string: " + result2);
        boolean result3 = isPermutationForNonRepeating(actualString,permutedString);
        System.out.println("Checking Permutation with assumption that no character is repeating: " + result3);
        boolean result4 = isPermutationByCountingCharacters(actualString,permutedString);
        System.out.println("Checking Permutation by counting characters in both: " + result4);

    }
}