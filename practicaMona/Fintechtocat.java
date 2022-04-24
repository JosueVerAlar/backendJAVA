package practicaMona;

public class Fintechtocat extends mona {
    String clothes;

    Fintechtocat(String name, int number, String type, String mood, String clothes){
        super(name, number, type, mood);
        this.clothes = clothes;
    }
    void showInfo(){
        System.out.println("Nombre: "+name+
                           "\n#"+number+
                           "\nTipo: "+type+
                           "\nAnimo: "+mood+
                           "\nVestimenta: "+clothes);
    }

    public static void main(String[] args) {
        Fintechtocat fintech = new Fintechtocat("Fintechtocat", 144, "analista",
                                                "feliz", "Ropa elegante");
        fintech.showInfo();
        }
}
