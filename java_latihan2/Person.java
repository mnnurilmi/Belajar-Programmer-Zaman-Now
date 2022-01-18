class Person {
    String name="ujang";
    String address="gembol";
    final String country = "Indonesia";

    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    // Person(String name){
    //     this(name, address=null);
    // }

    Person(){
        
    }

    void sayHallo(String name){
        System.out.println("Hallo "+name+" nama saya "+ this.name);
        System.out.println();
    }
}
