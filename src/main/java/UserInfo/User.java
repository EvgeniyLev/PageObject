package UserInfo;

/**
 * Created by EvgeniyL on 08.03.2016.
 */
public class User {
    private String login;
    private String email;
    private String password;
    private String password2;
    private String selectRu;

    public User(String login,String email, String password, String password2,String selectRu){
        this.login = login;
        this.email = email;
        this.password = password;
        this.password2 = password2;
        this.selectRu = selectRu;
    }
    /*
    public User setLogin(String login) {
        this.login = login;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }
    public User setUniverse(String universe) {
        this.selectRu = universe;
        return this;
    }
    public User setPassword(String password) {
        this.password = password;
        return this;
    }
    public User setPassword2(String password2) {
        this.password2 = password2;
        return this;
    }
    */
    public String getLogin() {
        return login;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getPassword2() {
        return password2;
    }
    public String getUniverse() {
        return selectRu;
    }


}
