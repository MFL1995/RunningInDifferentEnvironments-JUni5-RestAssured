package requestsImplemented;

import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import utils.SharedData;
import utils.TestContext;
import java.util.HashMap;

import static communication.request.login.builder.LoginBuilder.requestPostForAccountList;

public class ImplementationOfLogin extends AnnotationForImplementations{
    private static final Logger LOG = LogManager.getLogger(ImplementationOfLogin.class);
    public ImplementationOfLogin(TestContext context) {
        super(context);
    }
    public String selectEndPoint(String environment) {
        SharedData sharedData = new SharedData();
// Create a HashMap to store the environment names and end points
        HashMap<String, String> endPoints = new HashMap<>();
// Populate the HashMap with the values from sharedData
        endPoints.put("loginEndPoint", sharedData.getLoginEndPoint());
        endPoints.put("sitePropertiesBarcelona", sharedData.getSitePropertiesBarcelona());

        endPoints.put("sitePropertiesBirmingham", sharedData.getSitePropertiesBirmingham());
        endPoints.put("sitePropertiesBK2", sharedData.getSitePropertiesBK2());

        endPoints.put("barcelonaBranch", sharedData.getBarcelonaBranch());
        endPoints.put("BK2Branch", sharedData.getBK2Branch());

        endPoints.put("birmingham", sharedData.getBirmingham());
        endPoints.put("steering", sharedData.getSteering());
        endPoints.put("dnsProxy", sharedData.getDnsProxy());
        endPoints.put("nonExistingSite", sharedData.getNonExistingSite());
        endPoints.put("incorrectSite", sharedData.getIncorrectSite());
// Use the get() method to retrieve the end point for the given environment
        context.setSessionAttribute("saveEndPoint", endPoints.get(environment));
        return environment;
    }

    public void getCreationOfAuthentication() {
        SharedData shareDdata = new SharedData();
        Response response = context.requestSetup()
                .body(requestPostForAccountList(shareDdata.getUsername(), shareDdata.getPassword()))
                .post(context.getSessionAttribute("saveEndPoint").toString());
        String token = response.path("token");
        context.setResponse(response);
        context.setSessionAttribute("token", token);
    }

    public void getSecondAuthentication() {
        SharedData shareDdata = new SharedData();
        Response response = context.requestSetup()
                .body(requestPostForAccountList(shareDdata.getSecondUsername(), shareDdata.getSecondPassword()))
                .post(context.getSessionAttribute("saveEndPoint").toString());
        String token = response.path("token");
        context.setResponse(response);
        context.setSessionAttribute("token", token);
    }

}
