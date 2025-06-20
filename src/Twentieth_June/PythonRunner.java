package Twentieth_June;

public class PythonRunner {
    public static void runAllAdeelSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twentieth_June/Adeel/URLifyByAdeel.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllAliHaiderSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twentieth_June/Ali_Haider/URLifyByAliHaider.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllDaniyalSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twentieth_June/Daniyal/URLifyByDaniyal.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllHaniyaAnwarSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twentieth_June/Haniya_Anwar/URLifyByHaniyaAnwar.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllHunzlaIshfaqSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twentieth_June/Hunzla_Ishfaq/URLifyByHunzlaIshfaq.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllMehrabSiddiqueSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twentieth_June/Mehrab_Siddique/URLifyByMehrabSiddique.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllMuhammadUmairNazarSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twentieth_June/Muhammad_Umair_Nazar/URLifyByMuhammadUmairNazar.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllMuneebHussainSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twentieth_June/Muneeb_Hussain/URLifyByMuneebHussain.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllNomanSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twentieth_June/Noman/URLifyByNoman.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllNoshadSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twentieth_June/Noshad/URLifyByNoshad.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllShanzaFatimaSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twentieth_June/Shanza_Fatima/URLifyByShanzaFatima.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllSherazBinTahirSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twentieth_June/Sheraz_Bin_Tahir/URLifyBySherazBinTahir.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void runAllWaseemSolutions() {
        try {
            ProcessBuilder pb = new ProcessBuilder("python", "src/Twentieth_June/Waseem/URLifyByWaseem.py");
            pb.inheritIO();
            pb.start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}