package programmer_zaman_now.application;

import static programmer_zaman_now.data.Constant.*;
import programmer_zaman_now.util.*;
import programmer_zaman_now.data.Country;
import programmer_zaman_now.data.Application;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);
        System.out.println(
            MathUtil.sum(1,1,1,1));

        Country.City city = new Country.City();
        city.setName("Subang");

        System.out.println(city.getName());

        System.out.println(Application.PROCESSOR);
    }
}