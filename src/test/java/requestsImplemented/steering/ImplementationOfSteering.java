package requestsImplemented.steering;

import communication.request.steering.builder.SteeringInternetParams;
import communication.request.steering.builder.SteeringSaasParams;
import communication.request.steering.builder.SteeringSdwanParams;
import requestsImplemented.AnnotationForImplementations;
import utils.TestContext;

public class ImplementationOfSteering extends AnnotationForImplementations {
    public ImplementationOfSteering(TestContext context) {
        super(context);
    }
    public void getPUTRequestNoCircuit(SteeringSdwanParams steeringSdwanParams) {
        String authToken = headerConfigurator.configureAuthTokenHeader();
        steeringRequestSender.getPUTRequestNoCircuit(steeringSdwanParams, authToken);
    }

    public void getPUTRequestWithoutAuthentication(SteeringSdwanParams steeringSdwanParams) {
        steeringRequestSender.getPUTRequestWithoutAuthentication(steeringSdwanParams);
    }

    public void getPUTRequestSameOrDifferentPriority(SteeringSdwanParams steeringSdwanParams) {
        String authToken = headerConfigurator.configureAuthTokenHeader();
        steeringRequestSender.getPUTRequestSamePriority(steeringSdwanParams, authToken);
    }

    public void getPUTRequestOnePriorityOneAvoid(SteeringSdwanParams steeringSdwanParams) {
        String authToken = headerConfigurator.configureAuthTokenHeader();
        steeringRequestSender.getPUTRequestOnePriorityOneAvoid(steeringSdwanParams, authToken);
    }

    public void getPUTRequestTwoAvoid(SteeringSdwanParams steeringSdwanParams) {
        String authToken = headerConfigurator.configureAuthTokenHeader();
        steeringRequestSender.getPUTRequestTwoAvoid(steeringSdwanParams, authToken);
    }

    public void getPUTRequestEmptyName(SteeringSdwanParams steeringSdwanParams) {
        String authToken = headerConfigurator.configureAuthTokenHeader();
        steeringRequestSender.getPUTRequestEmptyName(steeringSdwanParams, authToken);
    }

    public void getPUTRequestEmptyPacketLoss(SteeringSdwanParams steeringSdwanParams) {
        String authToken = headerConfigurator.configureAuthTokenHeader();
        steeringRequestSender.getPUTRequestEmptyPacketLoss(steeringSdwanParams, authToken);
    }

    public void getInternetPUTRequest(SteeringInternetParams params) {
        String authToken = headerConfigurator.configureAuthTokenHeader();
        steeringRequestSender.getInternetPUTRequest(params, authToken);
    }

    public void getSaasPUTRequest(SteeringSaasParams params) {
        String authToken = headerConfigurator.configureAuthTokenHeader();
        steeringRequestSender.getSaasPUTRequest(params, authToken);
    }
}
