package Twenty_Third_June.Abdul_Ali;

import Constants_And_Methods.*;

import static Constants_And_Methods.Names.printAbdulAli;

// Problem Number: 1.4
// Problem Name: Palindrome Permutation
// Description: Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
// Link: https://www.geeksforgeeks.org/check-characters-given-string-can-rearranged-form-palindrome/

public class PalindromePermutationByAbdulAli {

    private static String method1() {
        return "";
    }
    private static String method2() {
        return "";
    }
    private static String method3() {
        return "";
    }

    private static void printAsciiArt() {
        System.out.println(
        "    ____        ___           __                        \n" +
        "   / __ \\____ _/ (_)___  ____/ /________  ____ ___  ___ \n" +
        "  / /_/ / __ `/ / / __ \\/ __  / ___/ __ \\/ __ `__ \\/ _ \\\n" +
        " / ____/ /_/ / / / / / / /_/ / /  / /_/ / / / / / /  __/\n" +
        "/_/    \\__,_/_/_/_/ /_/\\__,_/_/   \\____/_/ /_/ /_/\\___/ \n" +
        "\n" +
        "    ____                            __        __  _           \n" +
        "   / __ \\___  _________ ___  __  __/ /_____ _/ /_(_)___  ____ \n" +
        "  / /_/ / _ \\/ ___/ __ `__ \\/ / / / __/ __ `/ __/ / __ \\/ __ \\\n" +
        " / ____/  __/ /  / / / / / / /_/ / /_/ /_/ / /_/ / /_/ / / / /\n" +
        "/_/    \\___/_/  /_/ /_/ /_/\\__,_/\\__/\\__,_/\\__/_/\\____/_/ /_/\n"        );
    }

    private static void printQuestion() {
        System.out.println("Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.");
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
        method1();
        method2();
        method3();
    }
}