package Twenty_Fourth_June;

public class PythonRunner {
    public static void runAllAdeelSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twenty-Fourth_June/Adeel/OneAwayByAdeel.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllAliHaiderSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twenty-Fourth_June/Ali_Haider/OneAwayByAliHaider.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllHaniyaAnwarSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twenty-Fourth_June/Haniya_Anwar/OneAwayByHaniyaAnwar.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllHunzlaIshfaqSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twenty-Fourth_June/Hunzla_Ishfaq/OneAwayByHunzlaIshfaq.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllMehrabSiddiqueSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twenty-Fourth_June/Mehrab_Siddique/OneAwayByMehrabSiddique.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllMuhammadUmairNazarSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twenty-Fourth_June/Muhammad_Umair_Nazar/OneAwayByMuhammadUmairNazar.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllMuneebHussainSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twenty-Fourth_June/Muneeb_Hussain/OneAwayByMuneebHussain.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllNoshadSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twenty-Fourth_June/Noshad/OneAwayByNoshad.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}