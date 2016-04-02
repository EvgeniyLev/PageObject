package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;

import java.lang.reflect.Field;

/**
 * Created by EvgeniyL on 06.03.2016.
 */
public class DispleyedElementLocator extends AjaxElementLocator {

    public DispleyedElementLocator(WebDriver driver, Field field, int timeOutInSeconds){
    super(driver, field, timeOutInSeconds);
    }

    protected boolean isElementUsable(WebElement element){
        return element.isDisplayed();

    }
}
