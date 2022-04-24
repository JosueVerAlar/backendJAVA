package practicaMona;

public class Mardigrastocat extends mona{
    String items;

    Mardigrastocat(String name, int number, String type, String mood, String items) {
        super(name, number, type, mood);
        this.items = items;
    }

    void showInfo(){
        System.out.println("Nombre: "+name+
                "\n#"+number+
                "\nTipo: "+type+
                "\nAnimo: "+mood+
                "\nItems: "+items);
    }

    public static void main(String[] args) {
        Mardigrastocat mardi = new Mardigrastocat("Mardigrastocat", 96,
                                                   "Elegante", "Feliz",
                                                  "Collares y Máscara con plumas");
        mardi.showInfo();
    }
}
