package Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


/**
 * Created by EvgeniyL on 03.03.2016.
 */
public class LoginPage extends AnyPage{

    public LoginPage(PageManager pages){
        super(pages);
    }

    @FindBy(name="email")
    private WebElement userEmail;

    @FindBy(name="__nothing")
    private WebElement ogaUserPassvord;

    @FindBy(className="submit")
    private WebElement loginBtn;

    @FindBy(name="unis")
    private WebElement selectRu;

    @FindBy (id="content")
    private WebElement notError;


    public void setSelectRu(String planet){
        Select drop = new Select(selectRu);
        drop.selectByVisibleText(planet);
    }

    public LoginPage setUserName(String login) {
        userEmail.sendKeys(login);
        return this;
    }

    public LoginPage setPassword(String password) {
        ogaUserPassvord.sendKeys(password);
        return this;
    }

    public void sabmitBtn() {
            loginBtn.click();

    }

    public boolean isOk() {
        if(notError.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }


}