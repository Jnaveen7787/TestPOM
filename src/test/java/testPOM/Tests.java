package testPOM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.WeakHashMap;

/**
 * Created by riteshkumar on 18/12/2015.
 */
public class Tests extends LoginPage {

    WebDriver driver  = new FirefoxDriver();


//    By username = By.id("user_login");
//    By password = By.name("pwd");
//    By loginButton = By.name("wp-submit");


    @Before

    public void startBrowser()

    {
        driver.manage().window().maximize();
        driver.get("http://demosite.center/wordpress/wp-login.php");

    }

    @After
    public void tearDown() {

        driver.quit();
    }

    @Test
    public void verifyLogin() {

        login(driver);


    }

}
