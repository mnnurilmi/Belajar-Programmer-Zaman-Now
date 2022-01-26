package programmer_zaman_now.classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer value = 10;
        Long longValue = value.longValue();
        Double doubleValue = value.doubleValue();
        Short shortValue = value.shortValue();

        System.out.println(value);
        System.out.println(longValue);
        System.out.println(doubleValue);
        System.out.println(shortValue);

        String contoh = "10000";
        Integer contohInt = Integer.parseInt(contoh);
        System.out.println(contohInt);
    }
}
