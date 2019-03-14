package storage;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
public class ShopMessages {
   public static Map hashMap = new HashMap();
    public static void map() {
        Properties prop = new Properties();
        InputStream input = null;
        try {

            input = new FileInputStream("config.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        for (String key : prop.stringPropertyNames()) {
            String value = prop.getProperty(key);
            hashMap.put(key,value);
        }
    }
}