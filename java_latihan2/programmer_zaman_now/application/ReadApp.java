package programmer_zaman_now.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
    public static void main(String[] args) {


    ////$manual reader
    //        BufferedReader reader = null;
    //     try {
    //     reader = new BufferedReader(
    //         new FileReader("java_latihan2/Readme.md")
    //     );
    //     while(true){
    //         String line = reader.readLine();
    //         if(line == null){
    //             break;
    //         }
    //         System.out.println(line);
    //     }

    //     } catch (Throwable throwable){
    //         System.out.println("error baca file"+throwable.getMessage());
    //     } finally{
    //         if(reader != null){
    //             try {
    //                 reader.close();
    //                 System.out.print("sukses ditutup");
    //             } catch (IOException exception) {
    //                 System.out.println(exception.getLocalizedMessage());
    //             }
    //         }
    //     }
    // }

    //otomatis close reader
        try(BufferedReader reader = new BufferedReader(new FileReader("java_latihan2/Readme.md"))){
            while(true){
                String line = reader.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
        }catch(Throwable throwable){
            System.out.println("Error baca file "+ throwable.getMessage());
        }
    }
}
