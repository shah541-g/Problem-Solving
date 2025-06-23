package Twenty_Third_June;

public class JavaScriptRunner {
    public static void runAllAbdulMuqaddamSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("node", "src/Twenty-Third_June/Abdul_Muqaddam/PalindromePermutationByAbdulMuqaddam.js");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllGhulamRasoolSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("node", "src/Twenty-Third_June/Ghulam_Rasool/PalindromePermutationByGhulamRasool.js");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}