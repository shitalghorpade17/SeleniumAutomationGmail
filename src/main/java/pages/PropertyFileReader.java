package pages;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Forgeahead-Shital on 9/5/2017.
 */
public class PropertyFileReader {
    static Properties prop;

    public static Properties readfile() {
        try {
            String path = "src/main/resources/locators.properties";
            InputStream io = new FileInputStream(path);
            prop = new Properties();
            prop.load(io);
        } catch (Exception file) {
            System.out.println("Handled property file exception");
        }
        return prop;
    }
}
