package programmer_zaman_now.application;
import programmer_zaman_now.data.*;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Muhammad Nur Ilmi");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());

        //Konversi enum-string
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("STANDARD");
        System.out.println(level);  

        System.out.println("*print level");
        for(var value:Level.values()){
            System.out.println(value);
        }

    }
}
