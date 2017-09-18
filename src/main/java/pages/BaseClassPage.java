package pages;

import org.openqa.selenium.WebDriver;
import utils.PropertyFileReader;
import utils.XmlFileReader;

import java.util.Map;
import java.util.Properties;

/**
 * Created by Forgeahead-Shital on 9/11/2017.
 */
public class BaseClassPage {

   public static Map<String,String> map = XmlFileReader.readXmlFile("loginPage");
   public static WebDriver driver;
   static Properties prop;
   Properties configdata =  PropertyFileReader.readfile();
}
