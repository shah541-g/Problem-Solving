package Eleventh_June.Noshad;

import static Constants_And_Methods.Names.printNoshad;

public class MoveSpacesByNoshad {



    private static String moveSpaceToEndMethod1(){

        
        return "";
    }
    private static String moveSpaceToEndMethod2(){

        
        return "";
    }
    private static String moveSpaceToEndMethod3(){

        
        return "";
    }

    private static void printAsciiArt(){
        System.out.println(" __  __                  ____                         _____     \r\n" + //
                        "|  \\/  | _____   _____  / ___| _ __   __ _  ___ ___  |_   _|__  \r\n" + //
                        "| |\\/| |/ _ \\ \\ / / _ \\ \\___ \\| '_ \\ / _` |/ __/ _ \\   | |/ _ \\ \r\n" + //
                        "| |  | | (_) \\ V /  __/  ___) | |_) | (_| | (_|  __/   | | (_) |\r\n" + //
                        "|_|__|_|\\___/ \\_/_\\___| |____/| .__/ \\__,_|\\___\\___|   |_|\\___/ \r\n" + //
                        "| ____|_ __   __| |           |_|                               \r\n" + //
                        "|  _| | '_ \\ / _` |                                             \r\n" + //
                        "| |___| | | | (_| |                                             \r\n" + //
                        "|_____|_| |_|\\__,_|                                             ");
    }

    private static void printQuestion(){
        System.out.println("Move Space to end:\n You are given a string and you have to move all its\n" +
                            "inner spaces or any extra spaces at starting to the end.\n\n for example in the give instance if we consider - is representing space\n" + //
                            "Input: I-Love-You\n" + //
                            "Output: ILoveYou--\n" //
                                                        );
    }
    private static void printSpaces(){
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public static void runAllNoshadSolutions(){

        printNoshad();
        printSpaces();
        printAsciiArt();
        printSpaces();
        printQuestion();
        printSpaces();
        moveSpaceToEndMethod1();
        moveSpaceToEndMethod2();
        moveSpaceToEndMethod3();


    }
}
