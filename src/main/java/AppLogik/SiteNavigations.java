package AppLogik;

import java.util.concurrent.TimeUnit;

/**
 * Created by EvgeniyL on 08.03.2016.
 */
public class SiteNavigations extends DriverBasedHelper{
    private String baseUrl;


    public SiteNavigations(ApplicationManager manager) {
        super(manager.getWebDriver());
        this.baseUrl = manager.getBaseUrl();
    }



    public void openMainPage() {
        driver.get(baseUrl);
       driver.manage().window().maximize();

    }
}

