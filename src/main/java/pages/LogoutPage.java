package pages;

import org.openqa.selenium.By;
import utils.Controller;

/**
 * Created by Forgeahead-Shital on 9/5/2017.
 */
public class LogoutPage extends BaseClassPage{

    public static void logout(){
        try{
      //  Controller.getWebelement(map.get())
        BrowserLaunch.getDriver().findElement(By.xpath("//span[contains(@class,'gb_7a gbii')]")).click();
        Thread.sleep(2000);
        BrowserLaunch.getDriver().findElement(By.xpath("//a[@id='gb_71']")).click();
    }catch (Exception e){

        }
}
}
