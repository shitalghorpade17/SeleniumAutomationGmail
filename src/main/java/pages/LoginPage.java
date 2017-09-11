package pages;

import org.openqa.selenium.By;
import utils.Controller;

import java.util.Properties;

/**
 * Created by Forgeahead-Shital on 9/5/2017.
 */
public class LoginPage extends BaseClassPage {

    public static void login(String username, String password) {
        try{
            Controller.getWebelement(map.get("usernameXpath")).sendKeys(username);

            //   System.out.println(Controller.getWebelement("username"));
            // BrowserLaunch.getDriver().findElement(By.xpath(configdata.getProperty("usernameXpath"))).sendKeys(configdata.getProperty("username"));
            //     BrowserLaunch.getDriver().findElement(By.xpath(configdata.getProperty("nextAfterUsername"))).click();
            Controller.getWebelement(map.get("usernameNext")).click();
            //     driver.findElement(By.xpath("//input[@type='password']")).click();\
            Thread.sleep(3000);
            Controller.getWebelement(map.get("passwordXpath")).sendKeys(password);
            //     BrowserLaunch.getDriver().findElement(By.xpath(configdata.getProperty("passwordXpath"))).sendKeys(configdata.getProperty("password"));
            Thread.sleep(1000);
            Controller.getWebelement(map.get("passwordNext")).click();
            //   BrowserLaunch.getDriver().findElement(By.xpath(configdata.getProperty("nextAfterPassword"))).click();


        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }
    }

}
