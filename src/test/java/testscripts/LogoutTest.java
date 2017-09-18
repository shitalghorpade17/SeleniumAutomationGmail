package testscripts;

import org.testng.annotations.AfterTest;
import pages.LogoutPage;

/**
 * Created by Forgeahead-Shital on 9/14/2017.
 */


public class LogoutTest extends BaseClass{
    @AfterTest
    public void logoutTest(){
        LogoutPage.logout();
    }
}
