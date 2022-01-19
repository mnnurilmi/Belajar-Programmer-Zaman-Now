package programmer_zaman_now.data;

public class Product{
    public String name;
    public int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
            
    }

    public String toString(){
      return "product name "+ name+", price  "+ price;  
    }

    // @Override
    // public boolean equals(Object obj) {
    //     if(onj == this){
    //         return true;
    //     }
    //     if(!(obj instanceof Product)){
    //         return false;
    //     }
    //     Product product = (Product) obj;
    //     if(this.price!=product.price){
    //         return false;
    //     }
    //     if(this.name!= null){
    //         return this.name.equals(product.name)
    //     }else{
    //         return false;
    //     }
    // }

}