package programmer_zaman_now.application;

import programmer_zaman_now.data.Product;
;
public class Application {
    public static void main(String[] args) {
        Product product = new Product("MacbookPro", 30000000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
