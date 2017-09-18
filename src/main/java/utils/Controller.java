package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BrowserLaunch;

/**
 * Created by Forgeahead-Shital on 9/11/2017.
 */
public  class Controller {

    public static WebElement getWebelement (String locator){

        WebElement webElement = null;
        WebDriver driver= BrowserLaunch.driver;
        String locatorType=locator.split("_TBD_")[0];
        String locatorValue=locator.split("_TBD_")[1];
        switch (locatorType.toUpperCase()){
            case "XPATH" :
                webElement=driver.findElement(By.xpath(locatorValue));
                break;
            case "ID" :
                webElement= driver.findElement(By.id(locatorValue));
                break;
            default:
                System.out.println("Incorrect Locator Type as : "+locatorType);
        }
        return webElement;


           }
}
