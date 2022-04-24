package practicaHarry;

public class Rubeus {
    public static void main(String[] args) {
        showInfo();
    }

    public static void showInfo(){
        magician rh = new magician ("Rubeus Hagrid",
                                    "Male",
                                    "Lord Voldemort",
                                    "None",
                                     "Gryffindor");
        rh.showInfo();
    }
}
