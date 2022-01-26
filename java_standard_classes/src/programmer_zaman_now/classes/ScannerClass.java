package programmer_zaman_now.classes;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama");
        String name = scanner.nextLine();

        System.out.println("Hallo"+name);
    }
}
