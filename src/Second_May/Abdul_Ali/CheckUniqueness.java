package Second_May.Abdul_Ali;

import java.util.HashSet;
import java.util.Set;

public class CheckUniqueness {

    public boolean isUniqueViaBooleanArray(String string){

        boolean[] bitWiseArray = new boolean[128];
        for (char c : string.toCharArray()){

            if(bitWiseArray[(int) c]){
                return false;
            }
            bitWiseArray[(int) c] = true;

        }


        return true;
    }

    public boolean isUniqueViaSet(String string){

        Set<Character> seen = new HashSet<>();

        for (char c : string.toCharArray()){

            if(!seen.add(c)){
                return false;
            }
        }

        return true;
    }

    private char[] bubbleSort(String string){

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


    public boolean isUniqueViaSortedArray(String string){

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

    public boolean isUniqueViaBruteForce(String string){


        int length = string.length();
        for(int i=0;i<length-1;i++){
            char c = string.charAt(i);
            for(int j=i+1;j<length;j++){
                if(string.charAt(j) == c){
                    return false;
                }
            }
        }
        return true;
    }

    public static void printAscii(){

        System.out.println("    ____        __  __      _                     __             ___    __        __      __   ___    ___ \n" +
                "   /  ______   / / / ____  (_____ ___  _____     / /_  __  __   /   |  / /_  ____/ __  __/ /  /   |  / (_)\n" +
                "   / // ___/  / / / / __ \\/ / __ `/ / / / _ \\   / __ \\/ / / /  / /| | / __ \\/ __  / / / / /  / /| | / / / \n" +
                " _/ /(__  )  / /_/ / / / / / /_/ / /_/ /  __/  / /_/ / /_/ /  / ___ |/ /_/ / /_/ / /_/ / /  / ___ |/ / /  \n" +
                "/___/____/   \\____/_/ /_/_/\\__, /\\__,_/\\___/  /_.___/\\__, /  /_/  |_/_.___/\\__,_/\\__,_/_/  /_/  |_/_/_/   \n" +
                "                             /_/                    /____/                                                ");

    }


    public static void runAllAbdulAliSolutions(){

        printAscii();
        CheckUniqueness uniquenessChecker = new CheckUniqueness();
        System.out.println("Is Unique Via BruteForce: " + uniquenessChecker.isUniqueViaBruteForce("ahmad"));
        System.out.println("Is Unique Via BitWise Array (Just For AscII Values): " + uniquenessChecker.isUniqueViaBooleanArray("ahmad"));
        System.out.println("Is Unique Via Set/HashSet (For All Unicode Values): " + uniquenessChecker.isUniqueViaSet("ahmad"));
        System.out.println("Is Unique Via Sorted Array: " + uniquenessChecker.isUniqueViaSortedArray("ahmad"));

    }
}
