package programmer_zaman_now.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String name = "Muhammad Nur Ilmi";
        StringTokenizer tokenizer = new StringTokenizer(name, " ");

        while(tokenizer.hasMoreTokens()){
            String names = tokenizer.nextToken();

            System.out.println(names);
        }
    }
}
