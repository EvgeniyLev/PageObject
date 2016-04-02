package Negative;

import AppLogik.ApplicationManager;
import UserInfo.User;
import org.junit.*;


/**
 * Created by EvgeniyL on 15.03.2016.
 */
public class Tests {
    ApplicationManager app = new ApplicationManager();
/*
    @AfterTest
    public void stop() {
        app.stop();
 }

    @Before
    public void init() {
        app = new ApplicationManager();
    }
   //ПУСТЫЕ ЛОГИН И ПАРОЛЬ ВСЕЛЕННАЯ 1
    @Test
    public void test1N (){
        User user = new User().setEmail("").setPassword("").setUniverse("RU 1");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(!app.getUserActivities().isOkLoginPage());
    }
    //ПУСТОЙ ЛОГИН. ПАРОЛЬ ВЕРНЫЙ ВСЕЛЕННАЯ 1
    @Test
    public void test2N (){
        User user = new User().setEmail("").setPassword("usurim82").setUniverse("RU 1");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(!app.getUserActivities().isOkLoginPage());
    }

    //пустой пароль вселенная 1
    @Test
    public void test3N (){
        User user = new User().setEmail("LeV-Evg89@MaiL.ru").setPassword("").setUniverse("RU 1");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
    }

    //ПУСТЫЕ ЛОГИН И ПАРОЛЬ ВСЕЛЕННАЯ 2
    @Test
    public void test4N (){
        User user = new User().setEmail("").setPassword("").setUniverse("RU 2");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(!app.getUserActivities().isOkLoginPage());
    }
    //ПУСТОЙ ЛОГИН. ПАРОЛЬ ВЕРНЫЙ ВСЕЛЕННАЯ 2
    @Test
    public void test5N (){
        User user = new User().setEmail("").setPassword("usurim82").setUniverse("RU 2");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(!app.getUserActivities().isOkLoginPage());
    }

    //пустой пароль вселенная 2
    @Test
    public void test6N (){
        User user = new User().setEmail("LeV-Evg89@MaiL.ru").setPassword("").setUniverse("RU 2");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(!app.getUserActivities().isOkLoginPage());
    }

    //не верный логин вселенная 1
    @Test
    public void test7N (){
        User user = new User().setEmail("111").setPassword("UsuRim82").setUniverse("RU 1");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(!app.getUserActivities().isOkLoginPage());
    }

    //не верный паролоь вселенная 1
    @Test
    public void test8N (){
        User user = new User().setEmail("LeV-Evg89@MaiL.ru").setPassword("123").setUniverse("RU 1");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(!app.getUserActivities().isOkLoginPage());
    }

    //не верный логин и пароль вселенная1
    @Test
    public void test9N (){
        User user = new User().setEmail("233").setPassword("123").setUniverse("RU 1");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(!app.getUserActivities().isOkLoginPage());
    }
    //пароль зависит от регистра UsuRim82 вселенная 1
    @Test
    public void test10N (){
        User user = new User().setEmail("LeV-Evg89@MaiL.ru").setPassword("UsuRim82").setUniverse("RU 1");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(!app.getUserActivities().isOkLoginPage());
    }

    //не верный логин вселенная 2
    @Test
    public void test11N (){
        User user = new User().setEmail("111").setPassword("UsuRim82").setUniverse("RU 2");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(!app.getUserActivities().isOkLoginPage());
    }

    //не верный паролоь вселенная 2
    @Test
    public void test12N (){
        User user = new User().setEmail("LeV-Evg89@MaiL.ru").setPassword("123").setUniverse("RU 2");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(!app.getUserActivities().isOkLoginPage());
    }

    //не верный логин и пароль вселенная 2
    @Test
    public void test13N (){
        User user = new User().setEmail("233").setPassword("123").setUniverse("RU 2");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(!app.getUserActivities().isOkLoginPage());
    }
    //пароль зависит от регистра UsuRim82 вселенная 2
    @Test
    public void test14N (){
        User user = new User().setEmail("LeV-Evg89@MaiL.ru").setPassword("UsuRim82").setUniverse("RU 2");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().logInAs(user);
        Assert.assertTrue(!app.getUserActivities().isOkLoginPage());
    }

    //оставляем поле email пустым, остальные заполняем
    @Test
    public void CreateTest15N(){
        User user = new User();
        user.setEmail("");
        user.setLogin("EvgeniyL");
        user.setPassword("123456789");
        user.setPassword2("123456789");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().createNewUser(user);
        Assert.assertTrue(app.getUserActivities().isErrorCreateNew());
    }

    // Вводим не email не верного формата (результат всплывающее сообщение, которое не понятно как достать!!)
    @Test
    public void CreateTest16N(){
        User user = new User();
        user.setEmail("ерунда");
        user.setLogin("EvgeniyL");
        user.setPassword("123456789");
        user.setPassword2("123456789");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().createNewUser(user);
        Assert.assertTrue(app.getUserActivities().isErrorCreateNew());
    }


    //оставляем пустой логин(всплывающее сообщение, которое не понятно как достать)
    @Test
    public void CreateTest17N(){
        User user = new User();
        user.setEmail("lev-evg89@mail.ru");
        user.setLogin("");
        user.setPassword("123456789");
        user.setPassword2("123456789");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().createNewUser(user);
        Assert.assertTrue(app.getUserActivities().isErrorCreateNew());
    }


    //Логин из 2 символов (мин 3 символа, опять окно)
    @Test
    public void CreateTest18N(){
        User user = new User();
        user.setEmail("lev-evg89@mail.ru");
        user.setLogin("уе");
        user.setPassword("123456789");
        user.setPassword2("123456789");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().createNewUser(user);
        Assert.assertTrue(app.getUserActivities().isErrorCreateNew());
    }
    //Логин из 26 символов (макс 25 символа, опять окно)
    @Test
    public void CreateTest19N(){
        User user = new User();
        user.setEmail("lev-evg89@mail.ru");
        user.setLogin("gfgfgfgfgfgfgfgfgfgfgfgfgfk");
        user.setPassword("123456789");
        user.setPassword2("123456789");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().createNewUser(user);
        Assert.assertTrue(app.getUserActivities().isErrorCreateNew());
    }



    // Пароль пустой (на сайте ничего не происходит)
    @Test
    public void CreateTest20N(){
        User user = new User();
        user.setEmail("lev-evg89@mail.ru");
        user.setLogin("evg-eniy_ levch..enko ");
        user.setPassword("");
        user.setPassword2("");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().createNewUser(user);
        Assert.assertTrue(app.getUserActivities().isErrorCreateNew());
    }

    // Пароль менее 8 символов (на сайте ничего не происходит)
    @Test
    public void CreateTest21N(){
        User user = new User();
        user.setEmail("lev-evg89@mail.ru");
        user.setLogin("evg-eniy_ levch..enko ");
        user.setPassword("1234567");
        user.setPassword2("1234567");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().createNewUser(user);
        Assert.assertTrue(app.getUserActivities().isErrorCreateNew());
    }

    // Пароль менее 8 символов (на сайте ничего не происходит)
    @Test
    public void CreateTest22N(){
        User user = new User();
        user.setEmail("lev-evg89@mail.ru");
        user.setLogin("evg-eniy_ levch..enko ");
        user.setPassword("1234567");
        user.setPassword2("1234567");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().createNewUser(user);
        Assert.assertTrue(app.getUserActivities().isErrorCreateNew());
    }

    //Пароль повторный пароль оставляем пустым
    @Test
    public void CreateTest23N(){
        User user = new User();
        user.setEmail("lev-evg89@mail.ru");
        user.setLogin("evg-eniy_ levch..enko ");
        user.setPassword("1234567");
        user.setPassword2("");
        app.getSiteNavigations().openMainPage();
        app.getUserActivities().createNewUser(user);
        Assert.assertTrue(app.getUserActivities().isErrorCreateNew());
    }

*/
}
