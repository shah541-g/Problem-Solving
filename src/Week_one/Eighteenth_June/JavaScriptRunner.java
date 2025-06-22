package Eighteenth_June;

public class JavaScriptRunner {
    public static void runAllAbdulMuqaddamSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("node", "src/Eighteenth_June/Abdul_Muqaddam/IsUniqueByAbdulMuqaddam.js");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllGhulamRasoolSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("node", "src/Eighteenth_June/Ghulam_Rasool/IsUniqueByGhulamRasool.js");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllMuhammadAmmarZiaSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("node", "src/Eighteenth_June/Muhammad_Ammar_Zia/IsUniqueByMuhammadAmmarZia.js");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllSyedMuhammadAbdullahSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("node", "src/Eighteenth_June/Syed_Muhammad_Abdullah/IsUniqueBySyedMuhammadAbdullah.js");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}