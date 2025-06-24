package Twenty_Fourth_June;

public class JavaScriptRunner {
    public static void runAllAbdulMuqaddamSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("node", "src/Twenty-Fourth_June/Abdul_Muqaddam/OneAwayByAbdulMuqaddam.js");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllGhulamRasoolSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("node", "src/Twenty-Fourth_June/Ghulam_Rasool/OneAwayByGhulamRasool.js");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}