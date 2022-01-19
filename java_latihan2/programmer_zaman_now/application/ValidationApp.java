package programmer_zaman_now.application;
import programmer_zaman_now.error.ValidationException;
import programmer_zaman_now.util.*;

//ERROR karna tak ada login request package
//record class loginrequest masih preview/belum stabil dirilis java 14

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest  loginRequest = new LoginRequest(null,null);

        try{
            ValidationUtil.validate(loginRequest);
            System.out.println("Data valid");
        }catch(ValidationException e){
            System.out.println("Data tak valid : "+e.getMessage());
        }
    }
}
