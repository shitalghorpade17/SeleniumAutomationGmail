package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Forgeahead-Shital on 9/5/2017.
 */
public class BrowserLaunch extends BaseClassPage {
  //  public static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver==null){
            browserOpen();
        }
        return driver;
    }
    public static void browserOpen(){
        String browser = "";
        String baseUrl = "https://www.gmail.com/";
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/browserDrivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/browserDrivers/geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                System.setProperty("webdriver.chrome.driver", "src/main/resources/browserDrivers/chromedriver.exe");
                driver = new ChromeDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.get(baseUrl);

    }
}
