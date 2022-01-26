package programmer_zaman_now.classes;

import java.util.Base64;

public class Base64App {
    public static void main(String[] args) {
        String query = "belajar() pemograman() java";
        String encode = Base64.getEncoder().encodeToString(query.getBytes());

        System.out.println(encode);

        byte[] a = Base64.getDecoder().decode(encode);
        String res = new String(a);
        System.out.println(res);

    }
}
