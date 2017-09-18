package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utils.PropertyFileReader;

import java.util.Properties;

/**
 * Created by Forgeahead-Shital on 9/7/2017.
 */
public class ComposeMailPage extends BaseClassPage {

  //  Properties configdata = PropertyFileReader.readfile();
    public void composemail(){
        try {
            Thread.sleep(5000);
            BrowserLaunch.driver.findElement(By.xpath(configdata.getProperty("compose"))).click();
            Thread.sleep(3000);
            BrowserLaunch.driver.findElement(By.xpath(configdata.getProperty("mailTo"))).click();
            Thread.sleep(2000);
            BrowserLaunch.driver.findElement(By.xpath(configdata.getProperty("mailTo"))).sendKeys("parita.shaha@gmail.com");
            BrowserLaunch.driver.findElement(By.xpath(configdata.getProperty("mailTo"))).click();
            BrowserLaunch.driver.findElement(By.xpath(configdata.getProperty("mailTo"))).sendKeys(Keys.TAB);
         //   BrowserLaunch.driver.findElement(By.xpath(configdata.getProperty("addCCRecipients"))).click();
         //   BrowserLaunch.driver.findElement(By.xpath(configdata.getProperty("addCCRecipients"))).sendKeys("shital.ghorpade@forgeahead.io");
            BrowserLaunch.driver.findElement(By.xpath(configdata.getProperty("subjectBox"))).click();
            BrowserLaunch.driver.findElement(By.xpath(configdata.getProperty("subjectBox"))).sendKeys("Regarding sending mail from automation");
            BrowserLaunch.driver.findElement(By.xpath(configdata.getProperty("messageBody"))).click();
            BrowserLaunch.driver.findElement(By.xpath(configdata.getProperty("messageBody"))).sendKeys("I have done it from automation");
            BrowserLaunch.driver.findElement(By.xpath(configdata.getProperty("sendEmail"))).click();
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("waiting for mail id");
        }
    }
}
