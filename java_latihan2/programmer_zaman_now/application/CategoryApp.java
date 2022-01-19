package programmer_zaman_now.application;
import programmer_zaman_now.data.*;
public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setID("ID");
        category.setID(null);

        System.out.println(category.getID());

        
    }    
}
