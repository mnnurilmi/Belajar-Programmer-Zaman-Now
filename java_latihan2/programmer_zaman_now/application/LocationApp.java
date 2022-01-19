package programmer_zaman_now.application;
import programmer_zaman_now.data.City;

public class LocationApp {
    public static void main(String[] args) {
        //var location = new Location();  //Error karna abstract class
        var city = new City();
        city.name = "Cimahi";

        System.out.println(city.name);
    }
    
}
