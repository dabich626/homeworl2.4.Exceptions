import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        try {
            RegPerson regPerson = new RegPerson("skyProHomework", "blaBlaBla", "blaBlaBla");
            ExceptionService.checkAuthentication(regPerson);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
