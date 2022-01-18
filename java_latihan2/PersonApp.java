public class PersonApp {
    public static void main(String[] args) {
        // var person1 = new Person();
        // Person person2 = new Person();
        // Person person3;
        // person3 = new Person();

        // System.out.println(person1);
        // System.out.println(person2);
        // System.out.println(person3);
        var person1 = new Person();
        System.out.println(person1.name);
        System.out.println(person1.address);

        person1.name = "Muhammad Nur Ilmi";
        person1.address = "Jl.mukodar";

        System.out.println(person1.name);
        System.out.println(person1.address);

        person1.sayHallo("Ujang");

    }
}
