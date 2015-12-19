package testPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by riteshkumar on 18/12/2015.
 */
public class LoginPage {


    public void login(WebDriver driver) {


        driver.findElement(By.id("user_login")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("demo123");
        driver.findElement(By.name("wp-submit")).click();


    }



}
