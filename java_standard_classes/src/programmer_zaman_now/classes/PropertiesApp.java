package programmer_zaman_now.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties prop = new Properties();
            prop.load(new FileInputStream("src/programmer_zaman_now/application.properties"));  
            String host = prop.getProperty("database.host");
            System.out.println(host);
        }catch (FileNotFoundException f){
            System.out.println(f.getMessage());
        }catch (IOException e) {
           System.out.println(e.getMessage());
        }
    }
}
