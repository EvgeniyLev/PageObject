package Positive;
import AppLogik.ApplicationManager;
import UserInfo.User;
import org.junit.*;
import org.testng.annotations.AfterTest;


public class Tests {
    ApplicationManager app = new ApplicationManager();

    @Before
    public void init() { app = new ApplicationManager(); }

    @AfterTest
    public void stop() { app.stop(); }

    @Test
    public void loginTestAllDataIsValidUniverseRU1(){
        User user = new User(null, "lev-evg89@mail.ru", "usurim82", null, "RU 1");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(app.getUserActivities().isOkLoginPage());
        System.out.println("Hi git hub!");
            }

    @Test
    public void loginTestEmailDoesntDependOfRegisterUniverseRU1(){
        User user = new User(null, "LeV-Evg89@MaiL.ru", "usurim82", null, "RU 1");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(app.getUserActivities().isOkLoginPage());
    }

    @Test
    public void loginTestAllDataIsValidUniverseRU2(){
        User user = new User(null, "lev-evg89@mail.ru", "usurim82", null, "RU 2");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(app.getUserActivities().isOkLoginPage());
    }

    @Test
    public void loginTestEmailDoesntDependOfRegisterUniverseRU2(){
        User user = new User(null, "LeV-Evg89@MaiL.ru", "usurim82", null, "RU 2");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(app.getUserActivities().isOkLoginPage());
    }
    /*
    // ТЕСТ3 КОРРЕКТНЫЙ ЛОГИН(НЕ ЗАВИСИТ ОТ РЕГИСТРА) И ПАРОЛЬ(ЗАВИСИТ) ВСЕЛЕННАЯ 2
    @Test
    public void test3 (){
        User user = new User().setEmail("LeV-Evg89@MaiL.ru").setPassword("usurim82").setUniverse("RU 2");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(app.getUserActivities().isOkLoginPage());
    }
    // ТЕСТ4 КОРРЕКТНЫЕ ЛОГИН И ПАРОЛЬ, ВСЕЛЕННАЯ 2
    @Test
    public void test4 (){
        User user = new User().setEmail("lev-evg89@mail.ru").setPassword("usurim82").setUniverse("RU 2");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(app.getUserActivities().isOkLoginPage());
    }

    //Тест5 Создаем нового пользователя заполняем верно все поля
    @Test
    public void CreateTest1(){
        User user = new User();
        user.setEmail("lev-evg89@mail.ru");
        user.setLogin("EvgeniyL");
        user.setPassword("123456789");
        user.setPassword2("123456789");
       // user.setUniverse("22");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().createNewUser(user);
        Assert.assertTrue(!app.getUserActivities().isErrorCreateNew());
    }

    //Тест6 Логин содержит пробелы (должно пройти)
    @Test
    public void CreateTest2(){
        User user = new User();
        user.setEmail("lev-evg89@mail.ru");
        user.setLogin("evgeniy levchenko ");
        user.setPassword("123456789");
        user.setPassword2("123456789");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().createNewUser(user);
        Assert.assertTrue(!app.getUserActivities().isErrorCreateNew());
    }

    //Тест7 Логин символ (.) (должно пройти)
    @Test
    public void CreateTest3(){
        User user = new User();
        user.setEmail("lev-evg89@mail.ru");
        user.setLogin("evgeniy.levchenko ");
        user.setPassword("123456789");
        user.setPassword2("123456789");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().createNewUser(user);
        Assert.assertTrue(!app.getUserActivities().isErrorCreateNew());
    }

    //Тест8 Логин символ (-) (должно пройти)
    @Test
    public void CreateTest4(){
        User user = new User();
        user.setEmail("lev-evg89@mail.ru");
        user.setLogin("evgeniy-levchenko ");
        user.setPassword("123456789");
        user.setPassword2("123456789");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().createNewUser(user);
        Assert.assertTrue(!app.getUserActivities().isErrorCreateNew());
    }

    //Тест9 Логин символ (_) (должно пройти)
    @Test
    public void CreateTest5(){
        User user = new User();
        user.setEmail("lev-evg89@mail.ru");
        user.setLogin("evgeniy_levchenko ");
        user.setPassword("123456789");
        user.setPassword2("123456789");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().createNewUser(user);
        Assert.assertTrue(!app.getUserActivities().isErrorCreateNew());
    }

    //Тест10 Логин символы и пробелы (_.-  ) (должно пройти)
    @Test
    public void CreateTest6(){
        User user = new User();
        user.setEmail("lev-evg89@mail.ru");
        user.setLogin("evg-eniy_ levch..enko ");
        user.setPassword("123456789");
        user.setPassword2("123456789");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().createNewUser(user);
        Assert.assertTrue(!app.getUserActivities().isErrorCreateNew());
    }
    */
}
