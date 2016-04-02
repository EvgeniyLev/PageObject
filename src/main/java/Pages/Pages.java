package Pages;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by EvgeniyL on 06.03.2016.
 */
public abstract class Pages {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected PageManager pages;

public Pages(PageManager pages){
    this.pages = pages;
    driver = pages.getWebDriver();
    wait = new WebDriverWait(driver, 10);
}

public WebDriver getWebDriver(){
    return driver;
}

    public String getTitle(){
        return driver.getTitle();
    }

    public Pages ensurePageLoaded(){
        return this;
    }

    public boolean waitPageLoaded(){
        try{
            ensurePageLoaded();
            return true;
        }catch (TimeoutException t){
            return false;
        }
    }



}
