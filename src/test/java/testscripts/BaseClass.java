package testscripts;

        import pages.BrowserLaunch;
        import pages.LoginPage;
        import pages.PropertyFileReader;

        import java.util.Properties;

/**
 * Created by Forgeahead-Shital on 9/8/2017.
 */
public class BaseClass extends PropertyFileReader {

    public static void executeBasicTests(){
        BrowserLaunch.browserOpen();
        Properties configdata = PropertyFileReader.readfile();
        LoginPage.login(configdata.getProperty("username"),configdata.getProperty("password"));
    }
}
