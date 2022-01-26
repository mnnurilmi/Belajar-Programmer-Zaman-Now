package programmer_zaman_now.classes;

import java.util.Random;

public class randomApp {
    public static void main(String[] args) {
        Random rand = new Random();

        for(var i = 0 ;i <100;i++){
            int val = rand.nextInt(1000);
            System.out.println(val);
        }
    }
}
