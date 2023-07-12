public class WrongPasswordException extends ExceptionService {

    public WrongPasswordException(String login, String password, String confirmPassword) {
        super(login, password, confirmPassword);



        throw new WrongPasswordException(password.length() > 20 && password.contains("йцукенгшщзхъфывапролджэячсмитьбю=+ё~`,.<>?/\|';:" && password != confirmPassword));
        try {
            return regPerson.ExceptionService(login, password, confirmPassword);
        } catch (WrongPasswordException) {
            System.out.println("вы спевысили кллчиество символов в логине");
        }
    }


    }
}
