package AppLogik;
import WebDriver.WebDriverFactory;
import UtillApp.Browser;
import UtillApp.PropertyLoader;
import org.openqa.selenium.WebDriver;

/**
 * Created by EvgeniyL on 08.03.2016.
 */
public class ApplicationManager {
    private static WebDriver driver;
    private String baseUrl;
    private SiteNavigations nav;
    private UserActivities userActivities;
    private GameHelper gameHelper;

    public ApplicationManager() {
        baseUrl = PropertyLoader.loadProperty("site.url");
        String gridHubUrl = PropertyLoader.loadProperty("grid2.hub");
        Browser browser;
        browser = new Browser();
        browser.setName(PropertyLoader.loadProperty("browser.name"));
        browser.setVersion(PropertyLoader.loadProperty("browser.version"));
        browser.setPlatform(PropertyLoader.loadProperty("browser.platform"));

        String username = PropertyLoader.loadProperty("user.username");
        String password = PropertyLoader.loadProperty("user.password");
        driver = WebDriverFactory.getInstance(gridHubUrl, browser, username, password);
        userActivities = new UserActivities(this);
        nav = new SiteNavigations(this);
        gameHelper = new GameHelper(this);
        getNav().openMainPage();
    }

    public UserActivities getUserActivities(){
        return userActivities;
    }
    public SiteNavigations getSiteNavigations() {
        return nav;
    }
    public GameHelper getGameHelper() {
        return gameHelper;
    }

    protected WebDriver getWebDriver() {
        return driver;
    }

    protected String getBaseUrl() {
        return baseUrl;
    }

    public static void stop() {
        if (driver != null) {
            driver.quit();
        }
    }

    public SiteNavigations getNav() {
        return nav;
    }
}
