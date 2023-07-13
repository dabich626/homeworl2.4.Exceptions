public class ConfirmPasswordException extends Exception{

    public throws ConfirmPasswordException(String login, String password, String confirmPassword, String message) {
        super(login, password, confirmPassword, message);



        throw new ConfirmPasswordException(!password.equals(confirmPassword));
        try {
            return regPerson.ExceptionService(login, password, confirmPassword);
        } catch (WrongPasswordException) {
            System.out.println("вы спевысили кллчиество символов в логине");
        }
    }
}
