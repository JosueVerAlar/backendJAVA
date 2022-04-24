package practicaHarry;

public class magician {
    // Caracteristicas - campos
    String name;
    String gender;
    String boggart;
    String patronus;
    String house;

    //Constructor
    public magician (String name, String gender, String boggart, String patronus, String house){
        this.name = name;
        this.gender = gender;
        this.boggart = boggart;
        this.patronus = patronus;
        this.house = house;
    }

    //Metodos
    public String getName(){  return name;  }
    public String getGender(){  return gender;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }
    public String getHouse(){  return house;  }

    public boolean setName (String name){
        if (!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }
    public boolean setGender(String gender){
        if (!gender.isEmpty()){
            this.gender = gender;
            return true;
        } else
            return false;
    }
    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }
    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }
    public boolean setHouse(String house){
        if(!house.isEmpty()){
            this.house = house;
            return true;
        }else
            return false;
    }

    public void showInfo(){
        System.out.println("Name: "+name+
                           "\nGender: "+gender+
                           "\nHouse: "+house+
                           "\nBoggart: "+boggart+
                           "\nPatronus: "+patronus);
    }
}
