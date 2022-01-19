package programmer_zaman_now.data;

public class Application {
    public static final int PROCESSOR;
    static{
        System.out.println("Akses class Application");
        PROCESSOR = Runtime.getRuntime().availableProcessors();
        System.out.println(PROCESSOR);
    }
}
