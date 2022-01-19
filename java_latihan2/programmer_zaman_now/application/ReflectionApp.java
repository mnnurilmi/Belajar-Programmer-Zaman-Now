package programmer_zaman_now.application;

import programmer_zaman_now.data.CreateUserRequest;
import programmer_zaman_now.util.ValidationUtil2;

public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest re = new CreateUserRequest();
        re.setUsername("Muhammad Nur Ilmi");
        re.setPass("haha");
        re.setName("hihi");
        ValidationUtil2.validationReflection(re);
    }
}
