public class RegPerson {

    private String login;

    private String password;

    private String confirmPassword;



    public RegPerson(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;


    }



    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    RegPerson regPerson = new RegPerson("skyProHomework", "blaBlaBla", "blaBlaBla");

}
