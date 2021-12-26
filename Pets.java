public class Pets {
    String type, name;
    Integer old;

    public Pets(String type, String name, Integer old){
        this.type = type;
        this.name = name;
        this.old = old;
    }

    public String getType(){
        return this.type;
    }

    public String getName(){
        return this.name;
    }

    public Integer getOld(){
        return this.old;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setOld(Integer old){
        this.old = old;
    }
}
