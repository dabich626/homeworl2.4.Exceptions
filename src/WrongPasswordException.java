public class WrongPasswordException extends Exception {

    public throws WrongPasswordException(String login, String password, String confirmPassword, String message) {
        super(login, password, confirmPassword, message);



        throw new WrongPasswordException(password.length() > 20 || !password.contains(REGEX));
        try {
            return regPerson.ExceptionService(login, password, confirmPassword);
        } catch (WrongPasswordException) {
            System.out.println("вы спевысили кллчиество символов в пароле");
        }
    }




    }

