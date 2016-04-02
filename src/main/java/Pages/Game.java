package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by EvgeniyL on 15.03.2016.
 */
public class Game extends AnyPage {

    public Game (PageManager pages){
        super(pages);
    }

    @FindBy(className="planetname")
    private WebElement renamePlanet;

    @FindBy (className ="ui-state-default ui-corner-top ui-tabs-selected ui-state-active")
    private WebElement renameWindow;

    @FindBy(name="name")
    private WebElement setNewName;

    @FindBy(linkText = "Отправить")
    private WebElement sendNewNameBtn;

    public void setNewNameBtn(){
        sendNewNameBtn.click();
    }

    public Game setNewNameOfPlanet(String name){
        setNewName.clear();
        setNewName.sendKeys(name);
        return this;
    }
    public void renameWindowChoise(){
        renameWindow.click();
    }
    public void renameMyPlanetClick(){
         renamePlanet.click();
     }




}
