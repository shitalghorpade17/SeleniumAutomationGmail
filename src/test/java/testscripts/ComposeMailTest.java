package testscripts;

import org.testng.annotations.Test;
import pages.ComposeMailPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Forgeahead-Shital on 9/12/2017.
 */
public class ComposeMailTest extends BaseClass {
    @Test
    public void composemailtest(){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        ComposeMailPage composeMailPage = new ComposeMailPage();
        composeMailPage.composemail();


    }

}
