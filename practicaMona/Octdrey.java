package practicaMona;

public class Octdrey extends Mardigrastocat{
    String clothes;
    String hair;

    Octdrey(String name, int number, String type, String mood, String hair, String clothes, String items) {
        super(name, number, type, mood, items);
        this.hair = hair;
        this.clothes = clothes;
    }

    @Override
    void showInfo() {
        System.out.println("Nombre: "+name+
                "\n#"+number+
                "\nTipo: "+type+
                "\nAnimo: "+mood+
                "\nCabello: "+hair+
                "\nRopa: "+clothes+
                "\nItems: "+items);
    }

    public static void main(String[] args) {
        Octdrey oct = new Octdrey("Octdrey Catburn", 45, "Elegante", "Relajada",
                                   "elegante", "elegante", "Collar, Guantes, Cigarrillo largo");
        oct.showInfo();
    }
}
