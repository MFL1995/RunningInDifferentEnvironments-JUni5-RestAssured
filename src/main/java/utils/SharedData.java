package utils;

import lombok.Data;

import java.util.Properties;

@Data
public class SharedData {
    private String loginEndPoint;
    private String sitePropertiesBarcelona;
    private String sitePropertiesBirmingham;
    private String sitePropertiesBK2;
    private String steering;
    private String dnsProxy;
    private String barcelonaBranch;
    private String birmingham;
    private String BK2Branch;
    private String nonExistingSite;
    private String incorrectSite;
    private String username;
    private String password;
    private String secondUsername;
    private String secondPassword;
    private String baseURL;

    public SharedData() {
        String environment = System.getProperty("environment", "mock"); // Default to "mock"
        Properties properties = ConfigReader.initializeProp();
        String prefix = environment + ".";
        this.loginEndPoint = properties.getProperty(prefix + "loginEndPoint");
        this.sitePropertiesBarcelona = properties.getProperty(prefix + "sitePropertiesBarcelona");
        this.sitePropertiesBirmingham = properties.getProperty(prefix + "sitePropertiesBirmingham");
        this.sitePropertiesBK2 = properties.getProperty(prefix + "sitePropertiesBK2");
        this.steering = properties.getProperty(prefix + "steering");
        this.dnsProxy = properties.getProperty(prefix + "dnsProxy");
        this.barcelonaBranch = properties.getProperty(prefix + "barcelonaBranch");
        this.birmingham = properties.getProperty(prefix + "birmingham");
        this.BK2Branch = properties.getProperty(prefix + "BK2Branch");
        this.nonExistingSite = properties.getProperty(prefix + "nonExistingSite");
        this.incorrectSite = properties.getProperty(prefix + "incorrectSite");
        this.username = properties.getProperty(prefix + "username");
        this.password = properties.getProperty(prefix + "password");
        this.secondUsername = properties.getProperty(prefix + "secondUsername");
        this.secondPassword = properties.getProperty(prefix + "secondPassword");
        this.baseURL = properties.getProperty(prefix + "baseURL");
    }
}
