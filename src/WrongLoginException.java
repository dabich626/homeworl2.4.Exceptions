import javax.security.auth.login.LoginException;

public class WrongLoginException extends Exception {

    public throws WrongLoginException(String login, String password, String confirmPassword, String message) {
        super(message);

        throw new WrongLoginException(login.length() > 20 || !login.contains(REGEX));
        try {
            return regPerson.ExceptionService(login, password, confirmPassword);
        } catch (WrongLoginException) {
            System.out.println("вы спевысили кллчиество символов в логине");
        }


    }
}
