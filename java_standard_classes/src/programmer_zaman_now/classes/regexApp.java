package programmer_zaman_now.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexApp {
    public static void main(String[] args) {
        String name = "Muhammad Nur Ilmi PRogrammer Zaman Now";
        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);
        while(matcher.find()){
            
        System.out.println(matcher.group());
  
        }  }
}
