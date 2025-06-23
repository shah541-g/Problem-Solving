package Twenty_Third_June;

public class PythonRunner {
    public static void runAllAdeelSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twenty-Third_June/Adeel/PalindromePermutationByAdeel.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllAliHaiderSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twenty-Third_June/Ali_Haider/PalindromePermutationByAliHaider.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllHaniyaAnwarSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twenty-Third_June/Haniya_Anwar/PalindromePermutationByHaniyaAnwar.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllHunzlaIshfaqSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twenty-Third_June/Hunzla_Ishfaq/PalindromePermutationByHunzlaIshfaq.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllMehrabSiddiqueSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twenty-Third_June/Mehrab_Siddique/PalindromePermutationByMehrabSiddique.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllMuhammadUmairNazarSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twenty-Third_June/Muhammad_Umair_Nazar/PalindromePermutationByMuhammadUmairNazar.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllMuneebHussainSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twenty-Third_June/Muneeb_Hussain/PalindromePermutationByMuneebHussain.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllNoshadSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twenty-Third_June/Noshad/PalindromePermutationByNoshad.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}