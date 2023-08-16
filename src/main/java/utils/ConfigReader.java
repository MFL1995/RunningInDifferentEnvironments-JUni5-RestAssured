package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;
    private static FileInputStream fileInputStream;

    public static Properties initializeProp() {
        try {
            fileInputStream = new FileInputStream("config.properties");
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return properties;
    }
}
