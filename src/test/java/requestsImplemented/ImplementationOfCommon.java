package requestsImplemented;

import com.google.gson.JsonObject;
import communication.response.ErrorCodes.ErrorProperties;
import io.restassured.response.Response;
import lombok.SneakyThrows;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import utils.ResponseHandler;
import utils.TestContext;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;

import static communication.request.dnsproxy.builder.DnsProxyBuilder.dnsProxyDeleteBuilderRule;
import static communication.request.steering.builder.SteeringBuilder.steeringDeleteBuilder;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;

public class ImplementationOfCommon extends AnnotationForImplementations {
    private static final Logger LOG = LogManager.getLogger(ImplementationOfCommon.class);
    public ImplementationOfCommon(TestContext context) {
        super(context);
    }

    @SneakyThrows
    public static <T> T getJsonObject(Response response, Class<T> clazz, String getMethod) {    // Define a generic type parameter T for both the class and the get method
        Method method = clazz.getMethod(getMethod);    // Use reflection to get the method object from the class object and the get method name
        T object = response.as(clazz);    // Use the clazz argument to get the class object and deserialize the response
        return (T) method.invoke(object);    // Use the method object to invoke the get method on the deserialized object and return the result
        //Jackson expects that every field in the JSON input has a corresponding getter and setter method in the class
        /*
        It deserializes the response into an object of type T using the response.as method, which relies on the provided clazz.
        It invokes the getMethod on the deserialized object using the invoke method of the Method object.
        It returns the result of the getMethod invocation, which is cast to type T.*/
    }
    private String getJsonObjectPropertyValue(Response response, String propertyKey) {
        JsonObject jsonObject = response.as(JsonObject.class);
        return jsonObject.get(propertyKey).getAsString();
    }

    public void getVerifyResponseCodeStatus(Integer statusCode) {
        softAssert.assertEquals(Long.valueOf(statusCode), Long.valueOf(context.getResponse().getStatusCode()));
    }

    public void getVerifyResponseOfStatusProperty(String statusCode) {
        String actualStatus = getJsonObjectPropertyValue(context.getResponse(), "getStatus");
        softAssert.assertEquals(actualStatus, statusCode);
    }

    public void getVerifyResponseOfDetailProperty(String detail) {
        String actualDetail = getJsonObjectPropertyValue(context.getResponse(), "getDetail");
        softAssert.assertEquals(actualDetail, detail);

    }

    public void getVerifyResponseOfTitleProperty(String title) {
        String actualTitle = getJsonObjectPropertyValue(context.getResponse(), "getTitle");
        softAssert.assertEquals(actualTitle, title);
/*
        String message = context.response.path("violations[0].message");
        String field = context.response.path("violations[0].field");
        softAssert.assertEquals(field, "updateNetflowRuleSetV1.netflowRequestApiV1.collectors[0].port");
        softAssert.assertEquals(message, "must be less than or equal to 65535");
*/
    }

    public void getSoftAssertionsResponse() {
//        Soft assertions are the ones in which the test execution does not stop if the test does not meet the assertion condition
        softAssert.assertAll();
    }

    public void getVerifyResponseOfErrorProperty(String error) {
        String actualError = getJsonObjectPropertyValue(context.getResponse(), "getError");
        softAssert.assertEquals(actualError, error);
    }


    public void getDeleteSteeringRule() {
        context.requestSetup()
                .header("X-Auth-Token", context.getSessionAttribute("token").toString())
                .body(steeringDeleteBuilder())
                .put(context.getSessionAttribute("saveEndPoint").toString());
    }

    public void getDeleteDnsProxyRule(String description, ArrayList<String> proxies) {
        context.requestSetup()
                .header("X-Auth-Token", context.getSessionAttribute("token").toString())
                .when()
                .body(dnsProxyDeleteBuilderRule(description, proxies))
                .put(context.getSessionAttribute("saveEndPoint").toString());
    }
}
