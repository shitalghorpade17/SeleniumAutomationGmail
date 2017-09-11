package pages;

import org.openqa.selenium.By;

/**
 * Created by Forgeahead-Shital on 9/5/2017.
 */
public class LogoutPage {

    public static void logout(){
        BrowserLaunch.getDriver().findElement(By.xpath("//span[contains(@class,'gb_7a gbii')]")).click();
        BrowserLaunch.getDriver().findElement(By.xpath("//a[@id='gb_71']")).click();
    }
}
