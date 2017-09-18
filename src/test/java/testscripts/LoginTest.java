package testscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.LoginPage;
import utils.Controller;
import utils.PropertyFileReader;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by Forgeahead-Shital on 9/12/2017.
 */
public class LoginTest extends BaseClass {


    @Test
    public static void logintest() {

        LoginPage.login(configdata.getProperty("username"), configdata.getProperty("password"));

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WebElement resultGmailText= Controller.getWebelement(map.get("gmailText"));

                Assert.assertEquals(true,resultGmailText.isDisplayed(),"Login Successful");




    }

}
