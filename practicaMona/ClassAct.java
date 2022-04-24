package practicaMona;

public class ClassAct extends Mardigrastocat{

    ClassAct(String name, int number, String type, String mood, String items) {
        super(name, number, type, mood, items);
    }

    void showInfo(){
        System.out.println("Nombre: "+name+
                "\n#"+number+
                "\nTipo: "+type+
                "\nAnimo: "+mood+
                "\nItems: "+items);
    }

    public static void main(String[] args) {
        ClassAct clas = new ClassAct("Class Act", 2, "Elegante", "Feliz",
                                     "Sombrero, Monóculo y Bebida");
        clas.showInfo();
    }
}
