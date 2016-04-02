package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import java.lang.reflect.Field;

/**
 * Created by EvgeniyL on 06.03.2016.
 */
public class DispleyedElementLocatorFactory implements ElementLocatorFactory {
    private final WebDriver driver;
    private final int timeOutInSeconds;

    public DispleyedElementLocatorFactory(WebDriver driver, int timeOutInSeconds){
        this.driver = driver;
        this.timeOutInSeconds = timeOutInSeconds;
    }

    public ElementLocator createLocator(Field field) {
        return new DispleyedElementLocator(driver, field, timeOutInSeconds);
    }
}
