package testscripts;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pages.BaseClassPage;
import pages.BrowserLaunch;
import pages.LoginPage;
import utils.PropertyFileReader;

import java.util.Properties;

/**
 * Created by Forgeahead-Shital on 9/8/2017.
 */
public class BaseClass extends BaseClassPage{
    static Properties configdata = PropertyFileReader.readfile();

    @BeforeSuite
    public void display(){
        System.out.println("Hello, Here we have started automation scripts for gmail");

    }

    @AfterSuite
    public void displayAfterSuite(){
        System.out.println("Waw!!!!!!! Here we have finished with the automation scripts for gmail");

    }

    @BeforeTest
    public static void executeBasicTests(){
        BrowserLaunch.browserOpen();

      //  LoginPage.login(configdata.getProperty("username"),configdata.getProperty("password"));
    }
}
