package Twentieth_June;

public class JavaScriptRunner {
    public static void runAllAbdulMuqaddamSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("node", "src/Twentieth_June/Abdul_Muqaddam/URLifyByAbdulMuqaddam.js");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllGhulamRasoolSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("node", "src/Twentieth_June/Ghulam_Rasool/URLifyByGhulamRasool.js");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllMuhammadAmmarZiaSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("node", "src/Twentieth_June/Muhammad_Ammar_Zia/URLifyByMuhammadAmmarZia.js");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllSyedMuhammadAbdullahSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("node", "src/Twentieth_June/Syed_Muhammad_Abdullah/URLifyBySyedMuhammadAbdullah.js");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}