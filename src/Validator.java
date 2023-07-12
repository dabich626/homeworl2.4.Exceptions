public class Validator extends ExceptionService{

    public static void checkAuthentication(RegPerson person){

        checkLogin(person.getLogin());

        checkPass(person.getPassword());

        checkPassMatch(person.getPassword(), person.getConfirmPassword());

    }



    public Validator(String login, String password, String confirmPassword) {
        super(login, password, confirmPassword);

        



        public void ConfirmPasswordException () {


            throw new ConfirmPasswordException(getPassword() != getConfirmPassword());
        try {
            return regPerson.ExceptionService(login, password, confirmPassword);
        } catch (WrongPasswordException) {
            System.out.println("вы спевысили кллчиество символов в логине");
    }
}}}


