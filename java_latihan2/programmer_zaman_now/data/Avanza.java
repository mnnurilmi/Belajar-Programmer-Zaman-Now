package programmer_zaman_now.data;

public class Avanza implements Car, IsMaintanance{
    @Override
    public void drive() {
        System.out.println("is drive");
        
    }
    @Override
    public int getTire() {
        return 0;
    }

    @Override
    public String getBrand() {
        return "Toyota";
    }

    @Override
    public boolean isMaintanance() {
        return false;
    }

    
}
