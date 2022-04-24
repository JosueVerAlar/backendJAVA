package practicaHarry;

public class Ginny {
    public static void main(String[] args) {
        showInfo();
    }

    private static void showInfo() {
        magician gw = new magician("Ginny Weasley",
                                  "Female",
                                  "Lord Voldemort",
                                 "Horse",
                                   "Gryffindor");
        gw.showInfo();
    }
}
