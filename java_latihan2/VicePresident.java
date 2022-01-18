class VicePresident extends Manajer{
    
    VicePresident(String name){
        super(name);
    }

    VicePresident(){
        this(null);
    }

    void sayHallo(String name){
        System.out.println("hai "+name+" my name is VP "+this.name);
    }
}
