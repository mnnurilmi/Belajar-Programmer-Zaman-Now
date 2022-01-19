package programmer_zaman_now.application;
import programmer_zaman_now.data.*;

public class HelloApp {
    public static void main(String[] args) {
        Hello hello = new Hello(){
            public void sayHello(){
                System.out.println("Hello");
            }

            public void sayHello(String name){
                System.out.println("Hello "+name);
            }
        };


    }
}
