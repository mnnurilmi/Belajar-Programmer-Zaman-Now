package programmer_zaman_now.util;

import programmer_zaman_now.error.ValidationException;

//ERROR karna tak ada login request package
//record class loginrequest masih preview/belum stabil dirilis java 14

public class ValidationUtil {
    
    public static void validate(LoginRequest,loginRequest) throws ValidationException{
        if(loginRequest.username() == null){
            throw new NullPointerException("username is null")
        }else if(loginRequest.username().isBlank()){
            throw new ValidationException("username is isBlank")
        } else        if(loginRequest.password() == null){
            throw new NullPointerException("pass is null")
        }else         if(loginRequest.password().isBlank()){
            throw new ValidationException("pass is blanks")
        }
    }
}
