package programmer_zaman_now.annotation;
import java.lang.ProcessBuilder.Redirect.Type;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Fancy {
    String name();
    String [] tags() default {};

    
}
