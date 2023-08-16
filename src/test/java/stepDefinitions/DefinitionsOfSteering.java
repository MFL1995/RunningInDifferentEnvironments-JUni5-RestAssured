package stepDefinitions;

import communication.request.steering.builder.SteeringInternetParams;
import communication.request.steering.builder.SteeringSaasParams;
import communication.request.steering.builder.SteeringSdwanParams;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import utils.TestContext;

public class DefinitionsOfSteering extends AnnotationForDefinitions {
    public DefinitionsOfSteering(TestContext context) {
        super(context);
    }

    @And("I create PUT request for Sdwan Steering Protocol Rule")
    public void iCreatePUTRequestForSdwanSteeringProtocolRule(DataTable datatable) {
        SteeringSdwanParams steeringSdwanParams = steeringBuildParams.buildSteeringProtocol(datatable);
        implementationOfSteering.getPUTRequestNoCircuit(steeringSdwanParams);
    }

    @And("I create PUT request for Sdwan Steering Application Rule")
    public void iCreatePUTRequestForSdwanSteeringApplicationRule(DataTable datatable) {
        SteeringSdwanParams steeringSdwanParams = steeringBuildParams.buildSteeringApplication(datatable);
        implementationOfSteering.getPUTRequestNoCircuit(steeringSdwanParams);
    }

    @And("I create PUT request for Steering Rule without authentication")
    public void iCreatePUTRequestForSteeringRuleWithoutAuthentication(DataTable datatable) {
        SteeringSdwanParams steeringSdwanParams = steeringBuildParams.buildSteeringSamePriority(datatable);
        implementationOfSteering.getPUTRequestWithoutAuthentication(steeringSdwanParams);
    }

    @And("I create PUT request for Sdwan Steering Rule same Priority")
    public void iCreatePUTRequestForSdwanSteeringRuleSamePriority(DataTable datatable) {
        SteeringSdwanParams steeringSdwanParams = steeringBuildParams.buildSteeringSamePriority(datatable);
        implementationOfSteering.getPUTRequestSameOrDifferentPriority(steeringSdwanParams);
    }

    @And("I create PUT request for Sdwan Steering Rule one Priority one Avoid")
    public void iCreatePUTRequestForSdwanSteeringRuleOnePriorityOneAvoid(DataTable datatable) {
        SteeringSdwanParams steeringSdwanParams = steeringBuildParams.buildSteeringOnePriorityOneAvoid(datatable);
        implementationOfSteering.getPUTRequestOnePriorityOneAvoid(steeringSdwanParams);
    }

    @And("I create PUT request for Sdwan Steering Rule two Avoid")
    public void iCreatePUTRequestForSdwanSteeringRuleTwoAvoid(DataTable datatable) {
        SteeringSdwanParams steeringSdwanParams = steeringBuildParams.buildSteeringTwoAvoid(datatable);
        implementationOfSteering.getPUTRequestTwoAvoid(steeringSdwanParams);
    }

    @And("I create PUT request for Sdwan Steering Rule different Priority")
    public void iCreatePUTRequestForSdwanSteeringRuleDifferentPriority(DataTable datatable) {
        SteeringSdwanParams steeringSdwanParams = steeringBuildParams.buildSteeringSamePriority(datatable);
        implementationOfSteering.getPUTRequestSameOrDifferentPriority(steeringSdwanParams);
    }

    @And("I create PUT request for Sdwan Steering Protocol Rule, with empty Name")
    public void iCreatePUTRequestForSdwanSteeringProtocolRuleWithEmptyName(DataTable datatable) {
        SteeringSdwanParams steeringSdwanParams = steeringBuildParams.buildSteeringEmptyName(datatable);
        implementationOfSteering.getPUTRequestEmptyName(steeringSdwanParams);
    }

    @And("I create PUT request for Sdwan Steering Rule, with empty Packet Loss")
    public void iCreatePUTRequestForSdwanSteeringRuleWithEmptyPacketLoss(DataTable datatable) {
        SteeringSdwanParams steeringSdwanParams = steeringBuildParams.buildSteeringEmptyPacketLoss(datatable);
        implementationOfSteering.getPUTRequestEmptyPacketLoss(steeringSdwanParams);
    }

    @And("I create PUT request for Internet Steering Rule")
    public void iCreatePUTRequestForInternetSteeringRule(DataTable datatable) {
        SteeringInternetParams params = steeringBuildParams.buildSteeringInternet(datatable);
        implementationOfSteering.getInternetPUTRequest(params);
    }

    @And("I create PUT request for Internet Steering Rule, with empty Name")
    public void iCreatePUTRequestForInternetSteeringRuleWithEmptyName(DataTable datatable) {
        SteeringInternetParams params = steeringBuildParams.buildSteeringInternetEmptyName(datatable);
        implementationOfSteering.getInternetPUTRequest(params);
    }

    @And("I create PUT request for SAAS Steering Rule")
    public void iCreatePUTRequestForSAASSteeringRule(DataTable datatable) {
        SteeringSaasParams params = steeringBuildParams.buildSteeringSaas(datatable);
        implementationOfSteering.getSaasPUTRequest(params);
    }

    @And("I create PUT request for SAAS Steering Rule, with null Packet Loss")
    public void iCreatePUTRequestForSAASSteeringRuleWithNullPacketLoss(DataTable datatable) {
        SteeringSaasParams params = steeringBuildParams.buildSteeringSaasPacketLoss(datatable);
        implementationOfSteering.getSaasPUTRequest(params);
    }

    @And("I create PUT request for SAAS Steering Rule, with null Max Latency")
    public void iCreatePUTRequestForSAASSteeringRuleWithNullMaxLatency(DataTable datatable) {
        SteeringSaasParams params = steeringBuildParams.buildSteeringSaasMaxLatency(datatable);
        implementationOfSteering.getSaasPUTRequest(params);
    }

    @And("I create PUT request for SAAS Steering Rule, with null SAAS Application")
    public void iCreatePUTRequestForSAASSteeringRuleWithNullSAASApplication(DataTable datatable) {
        SteeringSaasParams params = steeringBuildParams.buildSteeringSaasApplication(datatable);
        implementationOfSteering.getSaasPUTRequest(params);
    }
}
