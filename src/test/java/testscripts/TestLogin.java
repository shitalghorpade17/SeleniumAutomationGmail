package testscripts;

import pages.BrowserLaunch;
import pages.ComposeMailPage;
import pages.LoginPage;
import pages.LogoutPage;
import utils.XmlFileReader;

import java.util.Map;

/**
 * Created by Forgeahead-Shital on 9/5/2017.
 */
public class TestLogin extends BaseClass {

    public static void main(String[] args) {
        try {

           BaseClass.executeBasicTests();
           Thread.sleep(5000);
   //         ComposeMailPage compose=new ComposeMailPage();
  //         compose.composemail();
   //        Thread.sleep(5000);
        //    LogoutPage.logout();


        } catch (Exception ex) {
            System.out.println(ex.getStackTrace());
        }
    }
}