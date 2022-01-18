class Manajer extends Employee{
    String company;

    Manajer(String name){
        super(name);
    }

    Manajer(String name, String company){
        super(name);
        this.company = company;
    };

    void sayHallo(String name){
        System.out.println("hai "+name+" my name is Manajer "+this.name);
    }


}
