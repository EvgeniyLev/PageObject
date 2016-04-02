package AppLogik;

import UserInfo.User;


/**
 * Created by EvgeniyL on 08.03.2016.
 */
public class UserActivities extends DriverBasedHelper{

    public UserActivities(ApplicationManager manager){
    super(manager.getWebDriver());
}




    public void logInAs(User user){
       pages.loginPage.setSelectRu(user.getUniverse());
          pages.loginPage.setUserName(user.getEmail())
           .setPassword(user.getPassword())
        .sabmitBtn();

}

    public void createNewUser(User user){
        pages.createNewPage.goToCreateNewUser();
        pages.createNewPage.ensurePageLoaded();
        pages.createNewPage.setNewEmail(user.getEmail())
                .setNewUserName(user.getLogin())
                .setNewPassword(user.getPassword())
                .repeateNewPassword(user.getPassword2())
                //.setSelectRu(user.getUniverse());
                .submitButton();
    }



    public boolean isErrorCreateNew() {
        return pages.createNewPage.isError();
    }

    public boolean isOkLoginPage() {
        return pages.loginPage.isOk();
    }
}
