package programmer_zaman_now.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Muhammad";
        first = first + " " + "Nur Ilmi";

        System.out.println(first);

        String scond = "Muhammad Nur Ilmi";
        System.out.println(scond);

        System.out.println(first == scond);
        System.out.println(first.equals(scond));

        String third = "Muhammad Nur Ilmi";
        System.out.println(scond == third); 
    }
}
