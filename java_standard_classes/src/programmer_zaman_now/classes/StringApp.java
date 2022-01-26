package programmer_zaman_now.classes;

public class StringApp {
    public static void main(String[] args) {
        String name = "Muhammad Nur Ilmi";
        String upper = name.toUpperCase();
        String lower = name.toLowerCase();
        System.out.println(name);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(name.length());
        System.out.println(name.startsWith("Ilmi"));
        System.out.println(name.endsWith("ilmi"));
    String[] names = name.split(" ");
    System.out.println(names);
    
    }
}
