import javax.security.auth.login.LoginException;

public class WrongLoginException extends RegPerson {

    public WrongLoginException(String login, String password, String confirmPassword) {
        super(login, password, confirmPassword);

        throw new WrongLoginException(login.length() > 20 && login.contains("йцукенгшщзхъфывапролджэячсмитьбю=+ё~`,.<>?/\|';:"));
        try{
            return regPerson.RegPerson(login,password,confirmPassword);
        } catch (WrongLoginException) {
            System.out.println("вы спевысили кллчиество символов в логине");
        }


    }}
