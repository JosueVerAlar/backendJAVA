package practicaMona;

public class Scottocat extends Fintechtocat{
    String items;

    Scottocat(String name, int number, String type, String mood, String clothes, String items) {
        super(name, number, type, mood, clothes);
        this.items = items;
    }

    void showInfo(){
        System.out.println("Nombre: "+name+
                "\n#"+number+
                "\nTipo: "+type+
                "\nAnimo: "+mood+
                "\nVestimenta: "+clothes+
                "\nItems: "+items);
    }

    public static void main(String[] args) {
        Scottocat scott = new Scottocat("Scottocat", 5, "Elegante",
                                        "Feliz", "Ropa elegante", "Bebida");
        scott.showInfo();
    }
}
