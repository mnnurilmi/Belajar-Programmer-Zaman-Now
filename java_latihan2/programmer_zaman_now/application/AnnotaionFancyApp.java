package programmer_zaman_now.application;

import programmer_zaman_now.annotation.Fancy;
import programmer_zaman_now.data.Animal;
import programmer_zaman_now.data.Cat;

@Fancy(name = "AnnotationFancyApp",tags = {"appplication","java"})


public class AnnotaionFancyApp {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.name = "puss";
        animal.run();
    }
}
