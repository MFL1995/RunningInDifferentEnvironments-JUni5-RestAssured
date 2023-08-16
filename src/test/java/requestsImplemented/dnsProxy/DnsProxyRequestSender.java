package requestsImplemented.dnsProxy;

import communication.request.dnsproxy.builder.DnsProxyParams;
import io.restassured.response.Response;
import utils.TestContext;
import static communication.request.dnsproxy.builder.DnsProxyBuilder.dnsProxyBuilderRule;

public class DnsProxyRequestSender {
    private final TestContext context;
    private final String saveEndPoint;

    public DnsProxyRequestSender(TestContext context) {
        this.context = context;
        Object saveEndPointValue = context.getSessionAttribute("saveEndPoint");
        this.saveEndPoint = (saveEndPointValue != null) ? saveEndPointValue.toString() : "";
    }

    public void getPutRequest(DnsProxyParams params, String authToken) {
        Response response = context.requestSetup()
                .header("X-Auth-Token", authToken)
                .body(dnsProxyBuilderRule(params))
                .put(context.getSessionAttribute("saveEndPoint").toString());
        context.setResponse(response);
    }

    public void getPostRequestWithoutAuthentication(DnsProxyParams params) {
        Response response = context.requestSetup()
                .body(dnsProxyBuilderRule(params))
                .put(context.getSessionAttribute("saveEndPoint").toString());
        context.setResponse(response);
    }

}
