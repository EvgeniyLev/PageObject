package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by EvgeniyL on 05.03.2016.
 */
public class CreateNew extends AnyPage {

    public CreateNew(PageManager pages){
        super(pages);
    }

    @FindBy (linkText = "Администрация уведомлена об ошибке")
    private WebElement errorText;

    @FindBy (linkText = "РЕГИСТРАЦИЯ")
    private WebElement clickForCreateNewUser;

    @FindBy (id="email")
    private WebElement newEmail;

    @FindBy (id="username")
    private WebElement newUserName;

    @FindBy (id="password")
    private WebElement newPassword;

    @FindBy (id="passwordReplay")
    private WebElement repeatePassword;

    @FindBy (name="unis")
    private WebElement selectServer;

    @FindBy (className ="submitButton")
    private WebElement submitButtonCreate;

    @FindBy(className="rowForm")
    private WebElement selectRu;

    public void setSelectRu(String value){
        Select newuniw = new Select(selectRu);
        newuniw.selectByValue(value);
    }

    public void goToCreateNewUser(){
        clickForCreateNewUser.click();;
    }

    public CreateNew setNewEmail(String email){
        newEmail.sendKeys(email);
        return this;
    }

    public CreateNew setNewUserName(String name){
        newUserName.sendKeys(name);
        return this;
    }

    public CreateNew setNewPassword(String pass){
        newPassword.sendKeys(pass);
        return this;
    }

    public CreateNew repeateNewPassword(String passw){
        repeatePassword.sendKeys(passw);
        return this;
    }

    public void submitButton(){
        submitButtonCreate.click();
    }

       public boolean isError() {
        if(errorText.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

}

