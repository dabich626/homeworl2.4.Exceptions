import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        try {
            ExceptionService.checkAuthentication();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
