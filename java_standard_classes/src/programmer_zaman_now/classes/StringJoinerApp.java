package programmer_zaman_now.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(",","[","]");
        joiner.add("Muhammad");
        joiner.add("Nur");
        joiner.add("ilmi");
        System.out.println(joiner);
    }
}
