package requestsImplemented;

import requestsImplemented.authTokenConfigurator.AuthTokenConfigurator;
import org.testng.asserts.SoftAssert;
import requestsImplemented.dnsProxy.DnsProxyRequestSender;
import requestsImplemented.steering.SteeringRequestSender;
import utils.TestContext;

public class AnnotationForImplementations {
    public final TestContext context;
    SoftAssert softAssert;
    public AnnotationForImplementations(TestContext context) {
        softAssert = new SoftAssert();
        this.context = context;
        headerConfigurator = new AuthTokenConfigurator(context);
        steeringRequestSender = new SteeringRequestSender(context);
        dnsProxyRequestSender = new DnsProxyRequestSender(context);
    }

    public final AuthTokenConfigurator headerConfigurator;
    public final SteeringRequestSender steeringRequestSender;
    public final DnsProxyRequestSender dnsProxyRequestSender;

}
