package programmer_zaman_now.data;

public interface Car extends HasBrand{
    void drive();
    int getTire();
    default boolean isBig(){    //default method,child tidak perlu override
        return false;
    };
    
}
