package programmer_zaman_now.data;

import programmer_zaman_now.error.DatabaseError;

public class DataBaseApp {
    public static void main(String[] args) {
        connectDatabase("Eko",null);
        System.out.println("sukses");
    }

    public static void connectDatabase(String username, String pass) {
        if(username=null || pass == null){
            throw new DatabaseError("tak bisa konek ke database");
        }
    }
}
