package programmer_zaman_now.error;

public class ValidationException extends Throwable {

    public ValidationException(String massage){
        super(massage); //kirim parameter ke parent class throwable
    }
}
