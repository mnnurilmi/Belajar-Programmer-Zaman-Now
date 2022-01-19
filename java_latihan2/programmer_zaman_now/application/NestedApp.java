package programmer_zaman_now.application;
import programmer_zaman_now.data.*;

public class NestedApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("programmer zaman now");

        Company.Employee employee = company.new Employee();
        employee.setName("Muhammad Nur Ilmi");
    
        Company company2 = new Company();
        company2.setName("belum ada");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Nur");

        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());
    }
}
