import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        RegPerson regPerson = new RegPerson("skyProHomework", "blaBlaBla", "blaBlaBla");
        ExceptionService.checkAuthentication();

        try { ExceptionService.checkAuthentication();
        }catch (WrongPasswordException) {
            System.out.println("пароль привышает допустимое колличество символов или имеет недопустимые символы");
           }

catch (ConfirmPasswordException) {
    System.out.println("пароли не совпадают");
        } catch (WrongLoginException){
            System.out.println("логин содержит недопустимые символы или превышает допустимое их коллиечтсво");
        }
finally {
            System.out.println("пожалуйста проверьте все поля и посторите попытку регистрации");

        }
    }
}