package requestsImplemented.dnsProxy;

import communication.request.dnsproxy.builder.DnsProxyParams;
import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import requestsImplemented.AnnotationForImplementations;
import utils.TestContext;
import static communication.request.dnsproxy.builder.DnsProxyBuilder.dnsProxyBuilderRule;

public class ImplementationOfDnsProxy extends AnnotationForImplementations {
    public ImplementationOfDnsProxy(TestContext context) {
        super(context);
    }

    public void getPutRequest(DnsProxyParams params) {
        String authToken = headerConfigurator.configureAuthTokenHeader();
        dnsProxyRequestSender.getPutRequest(params, authToken);
    }

    public void getPostRequestWithoutAuthentication(DnsProxyParams params) {
        Response response = context.requestSetup()
                .body(dnsProxyBuilderRule(params))
                .put(context.getSessionAttribute("saveEndPoint").toString());
        context.setResponse(response);
    }
}
