package Nineteenth_June;

public class JavaScriptRunner {
    public static void runAllAbdulMuqaddamSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("node", "src/Nineteenth_June/Abdul_Muqaddam/CheckPermutationByAbdulMuqaddam.js");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllGhulamRasoolSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("node", "src/Nineteenth_June/Ghulam_Rasool/CheckPermutationByGhulamRasool.js");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllMuhammadAmmarZiaSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("node", "src/Nineteenth_June/Muhammad_Ammar_Zia/CheckPermutationByMuhammadAmmarZia.js");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllSyedMuhammadAbdullahSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("node", "src/Nineteenth_June/Syed_Muhammad_Abdullah/CheckPermutationBySyedMuhammadAbdullah.js");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}