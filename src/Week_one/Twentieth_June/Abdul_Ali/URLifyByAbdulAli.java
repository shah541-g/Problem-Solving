package Twentieth_June.Abdul_Ali;

import Constants_And_Methods.*;

import static Constants_And_Methods.Names.printAbdulAli;

// Problem Number: 1.3
// Problem Name: URLify
// Description: Write a method to replace all spaces in a string with "%20". You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string. (Note: If implementing in Java, please use a character array so that you can perform this operation in place.)
// Link: https://www.geeksforgeeks.org/urlify-given-string-replace-spaces/

public class URLifyByAbdulAli {

    private static char[] URLifyViaRegex(String string, int actualLength){

        char[] url = string.trim().toCharArray();

        for(int i=0; i<url.length; i++){
            if(url[i]==' '){
                url[i] = '-';
            }
        }


        return new String(url).replaceAll("\\-", "%20").toCharArray();
    }

    private static char[] URLifyViaStringBuilder(String string, int actualLength){

        StringBuilder modifiedString = new StringBuilder(string.trim());
        for(int i=0;i<modifiedString.length();i++){
            if(modifiedString.charAt(i) == ' '){
                modifiedString.replace(i,i+1,"%20");
                i+=3;
            }
        }

        return new String(modifiedString).toCharArray();
    }

    private static char[] URLifyViaCharacterArray(char[] string, int actualLength){
//        The presumption for this method is that there are extra spaces = 2*inner-spaces at the end of the string
        int index = 0;
        int spaceCount = 0;
        for(index = 0; index<actualLength; index++){
            if(string[index]==' '){
                spaceCount++;
            }
        }
        index = actualLength + 2*spaceCount;
        if(actualLength<string.length) string[actualLength] = '\0';


        for(int i = actualLength-1;i>=0;i--){
            if(string[i]==' '){
                string[index-1] = '0';
                string[index-2] = '2';
                string[index-3] = '%';
                index-=3;
            }
            else{
                string[index-1] = string[i];
                index-=1;
            }
        }

        return string;
    }

    private static void printAscii(){
        System.out.println(" _   _ ____  _     _  __       \n" +
                "| | | |  _ \\| |   (_)/ _|_   _ \n" +
                "| | | | |_) | |   | | |_| | | |\n" +
                "| |_| |  _ <| |___| |  _| |_| |\n" +
                " \\___/|_| \\_\\_____|_|_|  \\__, |\n" +
                "                         |___/ ");
    }
    public static void runAllAbdulAliSolutions(){
        printAscii();;
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("URLify via Regex: " + new String(URLifyViaRegex("Mr John Smith     ", 13)));
        System.out.println("URLif via StringBuilder: " + new String(URLifyViaStringBuilder("Mr John Smith     ", 13)));
        System.out.println("URLify via characterArray with assumption that there are extra spaces = 2*inner-spaces at the end of the string: " + new String(URLifyViaCharacterArray("Mr John Smith    ".toCharArray(), 13)));
    }
}