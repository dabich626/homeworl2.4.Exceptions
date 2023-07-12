public class ExceptionService extends RegPerson {

    private static final String REGEX = "йцукенгшщзхъфывапролджэячсмитьбю=+ё~`,.<>?/-|';:";


    public String getREGEX() {
        return REGEX;
    }


    public ExceptionService(String login, String password, String confirmPassword) {
        super(login, password, confirmPassword);
    }

    public static void checkLogin(String login){

        if (login.length() > 20 && login.contains("йцукенгшщзхъфывапролджэячсмитьбю=+ё~`,.<>?/\|';:")){
            throw new WrongLoginException("Логин должен быть меньше 20 символов и содержать только латинские буквы, цифры и знак подчеркивания ")
        }
    }

    public static void checkPass(String password){

        if(password.length() > 20 && password = REGEX) {

            throw new WrongPasswordException("пароль содержит недопустимые символы и превышает 20 символов");
        }


    }

    public static void checkPassMatch (String password, String confirmPassword){

        if (password != confirmPassword){

            throw new ConfirmPasswordException ("пароли не совпадают");
        }
    }
}
