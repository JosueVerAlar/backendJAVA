public class Spiderman {
    //caracteristicas - campos
    private int id;
    private String universe;
    private String name;
    private String nickName;
    private String gender;
    private String custom;

    //Constructor
    public Spiderman (int id, String universe, String name, String nickName, String gender, String custom){
        this.id = id;
        this.universe = universe;
        this.name = name;
        this.nickName = nickName;
        this.gender = gender;
        this.custom = custom;
    }

    //Metodos
    public int getId(){  return id;  }
    public String getUniverse(){  return universe;  }
    public String getName(){  return name;  }
    public String getNickName(){  return nickName;  }
    public String getGender(){ return gender; }
    public String getCustom(){  return custom;  }

    public boolean setId(int id){
        if( id > 0 ){
            this.id = id;
            return true;
        } else
            return false;
    }
    public boolean setUniverse(String universe){
        if(!universe.isEmpty()){
            this.universe = universe;
            return true;
        } else
            return false;
    }
    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }
    public boolean setNickName(String nickName){
        if(!nickName.isEmpty()){
            this.nickName = nickName;
            return true;
        } else
            return false;
    }
    public boolean setGender(String gender){
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        } else
            return false;
    }
    public boolean setCustom(String custom){
        if(!custom.isEmpty()){
            this.custom = custom;
            return true;
        } else
            return false;
    }

    public String showInfo(){
        return
                "id: "+id+
                "\nUniverse: "+universe+
                "\nReal name: "+name+
                "\nNickname: "+nickName+
                "\nGender: "+gender+"\nCustom: "+custom+"\n";
    }
}
