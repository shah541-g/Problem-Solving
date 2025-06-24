package Twenty_Third_June.Abdul_Ali;

import Constants_And_Methods.*;

import static Constants_And_Methods.Names.printAbdulAli;

// Problem Number: 1.4
// Problem Name: Palindrome Permutation
// Description: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
// Link: https://www.geeksforgeeks.org/check-characters-given-string-can-rearranged-form-palindrome/

public class PalindromePermutationByAbdulAli {

//    Whole Crux of the problem:
//      If the count of characters with odd frequencies is ≤ 1, then yes, it's a permutation of a palindrome.

    private static boolean isPalindromePossibleViaPermutationMethod1(char[] string){

        String modifiedString = new String(string);
        modifiedString = modifiedString.toLowerCase();
        char[] arrayToBeProcessed = modifiedString.toCharArray();
//        First of all count the frequency of each letter
        int[] letters = new int[128];

        for(char c: arrayToBeProcessed){
            if(c!=' ') letters[c]++;
        }

//        now count how many letters appear odd time, if more then 1 then palindrome not possible

        int oddFrequencyLettersCount = 0;
        for(int count: letters){
            if(oddFrequencyLettersCount>1){
                return false;
            }
            if(count%2==1){
                oddFrequencyLettersCount++;
            }
        }


        return true;
    }

    private static boolean isPalindromePossibleViaPermutationMethod2(char[] string){

        String modifiedString = new String(string);
        modifiedString = modifiedString.toLowerCase();
        char[] lettersToBeProcessed = modifiedString.toCharArray();
        int[] lettersFrequencies = new int[128];
        int oddCount = 0;
        for(char c: lettersToBeProcessed){
            lettersFrequencies[c]++;
            if(lettersFrequencies[c]%2==0){
                oddCount--;
            }
            else{
                oddCount++;
            }
        }

        return oddCount<=1;
    }
    private static void printAsciiArt(){
        System.out.println(" ____       _ _           _                                \n" +
                "|  _ \\ __ _| (_)_ __   __| |_ __ ___  _ __ ___   ___       \n" +
                "| |_) / _` | | | '_ \\ / _` | '__/ _ \\| '_ ` _ \\ / _ \\      \n" +
                "|  __/ (_| | | | | | | (_| | | | (_) | | | | | |  __/      \n" +
                "|_|__ \\__,_|_|_|_| |_|\\__,_|_|  \\___/|_| |_| |_|\\___|      \n" +
                "|  _ \\ ___ _ __ _ __ ___  _   _| |_ __ _| |_(_) ___  _ __  \n" +
                "| |_) / _ \\ '__| '_ ` _ \\| | | | __/ _` | __| |/ _ \\| '_ \\ \n" +
                "|  __/  __/ |  | | | | | | |_| | || (_| | |_| | (_) | | | |\n" +
                "|_|   \\___|_|  |_| |_| |_|\\__,_|\\__\\__,_|\\__|_|\\___/|_| |_|");
    }

    private static void printQuestion(){
        System.out.println("Palindrome Permutation:\n" +
                " Given a string, write a function to check if it is a permutation of a palindrome. A\n palindrome is a word or phrase that is the same forwards and backwards. A permutation\n is a rearrangement of letters. The palindrome does not need to be limited to just\n dictionary words. " +
                "\n" +
                "-----------------------------------------\n" +
                "EXAMPLE\n" +
                "-----------------------------------------\n" +
                "Input: Tact Coa\n" +
                "Output: True (permutations: \"taco cat\", \"atco cta\", etc.)\n");
    }
    private static void printSpaces(){
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public static void runAllAbdulAliSolutions(){

        printAsciiArt();
        printSpaces();
        printQuestion();
        printSpaces();
        char[] string = {'T','a','c','t','c','o','a','p','a','p','a'};
        System.out.print("String is '" + new String(string) + "' Does its permutation results into a palindrome? \nMethod 1: ");
        if (isPalindromePossibleViaPermutationMethod1(string)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.print("\nMethod 2: ");
        if (isPalindromePossibleViaPermutationMethod2(string)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}
