package programmer_zaman_now.application;
import programmer_zaman_now.data.Animal;
import programmer_zaman_now.data.Cat;


public class AnimalApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "pus";
        animal.run();

    }
}
