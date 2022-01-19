package programmer_zaman_now.data;

public class Category {
    private String id;
    private boolean expensive;

    public String getID(){
        return id;
    }

    public void setID(String id){
        if(id!=null){
            this.id = id;
        }
    }

    public boolean isExpensive (){
        return this.expensive;
    }

    public void setExpensive(boolean expensive){
        this.expensive = expensive;
    }
    
}   
