package programmer_zaman_now.classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        ////TIDAK DISARANKAN karna MEMAKAN MEMORI
        // String name = "Muhammad";
        // name = name + " " + "Nur Ilmi";
        // name = name + " " + "Nur Ilmi";

        StringBuilder builder = new StringBuilder();
        builder.append("Muhammad");
        builder.append(" ");
        builder.append("Nur");
        builder.append(" ");
        builder.append("Ilmi");
        System.out.println(builder);
    }
}
