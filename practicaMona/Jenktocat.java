package practicaMona;

public class Jenktocat extends Scottocat{
    String faceChanges;

    Jenktocat(String name, int number, String type, String mood, String faceChanges, String clothes, String items) {
        super(name, number, type, mood, clothes, items);
        this.faceChanges = faceChanges;
    }

    void showInfo(){
        System.out.println("Nombre: "+name+
                            "\n#"+number+
                            "\nTipo: "+type+
                            "\nAnimo: "+mood+
                            "\nCambio facial: "+faceChanges+
                            "\nVestimenta: "+clothes+
                            "\nItems: "+items);
    }

    public static void main(String[] args) {
        Jenktocat jenk = new Jenktocat("Jenktocat", 36, "Mesero",
                                       "Feliz", "Bigote frances", "Ropa elegante",
                                        "Trapo y Guantes");
        jenk.showInfo();
    }
}
