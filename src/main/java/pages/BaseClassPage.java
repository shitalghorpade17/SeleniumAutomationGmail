package pages;

import utils.XmlFileReader;

import java.util.Map;

/**
 * Created by Forgeahead-Shital on 9/11/2017.
 */
public class BaseClassPage {

   static Map<String,String> map = XmlFileReader.readXmlFile("loginPage");
}
