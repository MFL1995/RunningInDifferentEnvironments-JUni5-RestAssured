package requestsImplemented;

import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import utils.TestContext;

import java.util.Objects;

import static communication.request.sdWanNetwork.builder.SdWanNetworkBuilder.siteLockRequest;

public class ImplementationOfSdWanNetwork extends AnnotationForImplementations {
    private static final Logger LOG = LogManager.getLogger(ImplementationOfSdWanNetwork.class);

    public ImplementationOfSdWanNetwork(TestContext context) {
        super(context);
    }

    public void getLockOfSite(String parameterA) {
        context.requestSetup()
                .header("X-Auth-Token", context.getSessionAttribute("token").toString())
                .body(siteLockRequest(parameterA))
                .patch(context.getSessionAttribute("saveEndPoint").toString());
    }

    public void getWaitCondition() {
        while (!Objects.equals(context.getResponse()
                .path("ongoing_action"), "NONE")) {
            getSiteDetails();
        }
    }

    public void getSiteDetails() {
        Response response = context.requestSetup()
                .header("X-Auth-Token", context.getSessionAttribute("token").toString())
                .get(context.getSessionAttribute("saveEndPoint").toString());
        context.setResponse(response);
    }
}
