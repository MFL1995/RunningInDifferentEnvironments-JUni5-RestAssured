package requestsImplemented.steering;

import communication.request.steering.builder.SteeringInternetParams;
import communication.request.steering.builder.SteeringSaasParams;
import communication.request.steering.builder.SteeringSdwanParams;
import io.restassured.response.Response;
import utils.TestContext;

import static communication.request.steering.builder.SteeringBuilder.*;

public class SteeringRequestSender {
    private final TestContext context;
    private final String saveEndPoint;

    public SteeringRequestSender(TestContext context) {
        this.context = context;
        Object saveEndPointValue = context.getSessionAttribute("saveEndPoint");
        this.saveEndPoint = (saveEndPointValue != null) ? saveEndPointValue.toString() : "";
    }

    public void getPUTRequestNoCircuit(SteeringSdwanParams steeringSdwanParams, String authToken) {
        Response response = context.requestSetup()
                .header("X-Auth-Token", authToken)
                .body(steeringSdwanNoCircuitBuilder(steeringSdwanParams))
                .put(context.getSessionAttribute("saveEndPoint").toString());
        context.setResponse(response);

    }

    public void getPUTRequestWithoutAuthentication(SteeringSdwanParams steeringSdwanParams) {
        Response response = context.requestSetup()
                .body(steeringSdwanSamePriorityBuilder(steeringSdwanParams))
                .put(context.getSessionAttribute("saveEndPoint").toString());
        context.setResponse(response);

    }

    public void getPUTRequestSamePriority(SteeringSdwanParams steeringSdwanParams, String authToken) {
        Response response = context.requestSetup()
                .header("X-Auth-Token", authToken)
                .body(steeringSdwanSamePriorityBuilder(steeringSdwanParams))
                .put(context.getSessionAttribute("saveEndPoint").toString());
        context.setResponse(response);

    }

    public void getPUTRequestOnePriorityOneAvoid(SteeringSdwanParams steeringSdwanParams, String authToken) {
        Response response = context.requestSetup()
                .header("X-Auth-Token", authToken)
                .body(steeringSdwanOnePriorityOneAvoidBuilder(steeringSdwanParams))
                .put(context.getSessionAttribute("saveEndPoint").toString());
        context.setResponse(response);

    }

    public void getPUTRequestTwoAvoid(SteeringSdwanParams steeringSdwanParams, String authToken) {
        Response response = context.requestSetup()
                .header("X-Auth-Token", authToken)
                .body(steeringSdwanTwoAvoidBuilder(steeringSdwanParams))
                .put(context.getSessionAttribute("saveEndPoint").toString());
        context.setResponse(response);

    }

    public void getPUTRequestEmptyName(SteeringSdwanParams steeringSdwanParams, String authToken) {
        Response response = context.requestSetup()
                .header("X-Auth-Token", authToken)
                .body(steeringSdwanSamePriorityBuilder(steeringSdwanParams))
                .put(context.getSessionAttribute("saveEndPoint").toString());
        context.setResponse(response);

    }

    public void getPUTRequestEmptyPacketLoss(SteeringSdwanParams steeringSdwanParams, String authToken) {
        Response response = context.requestSetup()
                .header("X-Auth-Token", authToken)
                .body(steeringSdwanSamePriorityBuilder(steeringSdwanParams))
                .put(context.getSessionAttribute("saveEndPoint").toString());
        context.setResponse(response);

    }

    public void getInternetPUTRequest(SteeringInternetParams params, String authToken) {
        Response response = context.requestSetup()
                .header("X-Auth-Token", authToken)
                .body(steeringInternetBuilder(params))
                .put(context.getSessionAttribute("saveEndPoint").toString());
        context.setResponse(response);

    }

    public void getSaasPUTRequest(SteeringSaasParams params, String authToken) {
        Response response = context.requestSetup()
                .header("X-Auth-Token", authToken)
                .body(steeringSaasBuilder(params))
                .put(context.getSessionAttribute("saveEndPoint").toString());
        context.setResponse(response);

    }
}
