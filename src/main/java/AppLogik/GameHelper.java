package AppLogik;

/**
 * Created by EvgeniyL on 15.03.2016.
 */
public class GameHelper extends DriverBasedHelper {
    public GameHelper(ApplicationManager manager){
        super(manager.getWebDriver());
    }

public void renamePlanet(String name){
    pages.game.renameMyPlanetClick();
       pages.game.setNewNameOfPlanet(name);
    pages.game.setNewNameBtn();
}

}
