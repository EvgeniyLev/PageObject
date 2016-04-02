package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

/**
 * Created by EvgeniyL on 06.03.2016.
 */
public class PageManager {
    //Задача класса - инициализация страниц
    private WebDriver driver;
    public LoginPage loginPage;
    public CreateNew createNewPage;
    public Game game;


    public PageManager(WebDriver driver){
        this.driver = driver;
        loginPage = initElements(new LoginPage(this));
        createNewPage = initElements(new CreateNew(this));
        game = initElements(new Game(this));

    }

    private <T extends Pages> T initElements(T pages){
        PageFactory.initElements(driver, pages);
       PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), pages);
       //PageFactory.initElements(new DispleyedElementLocatorFactory(driver, 10), pages);
        return pages;
    }
public WebDriver getWebDriver(){
    return driver;
}

}
