package programmer_zaman_now.application;

public class StackTraceElementApp {
    public static void main(String[] args) {
        try{
            String[] name = {
                "ujang",
                "gembol",
                "dll"
            };
            System.out.println(name[100]);
        }catch(Throwable t){
            // StackTraceElement[] stak = t.getStackTrace();
            t.printStackTrace();
        }
    }
}
