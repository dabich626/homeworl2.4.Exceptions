import javax.security.auth.login.LoginException;

public class WrongLoginException extends Exception {

    public WrongLoginException(String message) {
        super(message);

    }
}
