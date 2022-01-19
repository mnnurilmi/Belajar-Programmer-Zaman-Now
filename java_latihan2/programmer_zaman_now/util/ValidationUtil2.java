package programmer_zaman_now.util;

import java.lang.reflect.Field;

import programmer_zaman_now.annotation.NotBlanck;
import programmer_zaman_now.error.BlankException;
import programmer_zaman_now.error.ValidationException;

public class ValidationUtil2 {
    public static void validationReflection(Object object){
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for(var field:fields){
            field.setAccessible(true);

            if(field.getAnnotation(NotBlanck.class)!= null){
                //validated
                try {
                    String value = (String) field.get(object);
                    if(value == null || value.isBlank()){
                        throw new BlankException("Field "+field.getName()+" is blank");
                    }
                } catch (IllegalAccessException illegalAccessException) {
                    System.out.println("tidak bisa akses field private "+ illegalAccessException.getLocalizedMessage());
                }
            }
        }
    }
}
