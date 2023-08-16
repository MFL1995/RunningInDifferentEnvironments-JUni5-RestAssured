package stepDefinitions.buildParams;

import communication.request.steering.builder.SteeringInternetParams;
import communication.request.steering.builder.SteeringSaasParams;
import communication.request.steering.builder.SteeringSdwanParams;
import io.cucumber.datatable.DataTable;

import java.util.*;

public class SteeringBuildParams {

    public SteeringSdwanParams buildSteeringProtocol(DataTable datatable) {
        List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
        Map<String, String> rowData = data.get(0);
        return SteeringSdwanParams.builder()
                .saveChangesDescription(rowData.get("DescriptionSaveRule"))
                .name(rowData.get("Name"))
                .ruleDescription(rowData.get("RuleDescription"))
                .vpn(rowData.get("Vpn"))
                .rule_type(rowData.get("RuleType"))
                .application(new ArrayList<>())
                .protocol(rowData.get("Protocol"))
                .behaviour(rowData.get("Behavior"))
                .evaluate_continuously(Boolean.valueOf(rowData.get("EvaluateContinuously")))
                .editable(Boolean.valueOf(rowData.get("Editable")))
                .priority(Integer.valueOf(rowData.get("Priority")))
                .sourceFirstIp(rowData.get("SourceFirstIp"))
                .sourceSecondIp(rowData.get("SourceSecondIp"))
                .sourceFirstFrom(Integer.valueOf(rowData.get("SourceFirstFrom")))
                .sourceFirstTo(Integer.valueOf(rowData.get("SourceFirstTo")))
                .sourceSecondFrom(Integer.valueOf(rowData.get("SourceSecondFrom")))
                .sourceSecondTo(Integer.valueOf(rowData.get("SourceSecondTo")))
                .destinationFirstIp(rowData.get("DestinationFirstIp"))
                .destinationSecondIp(rowData.get("DestinationSecondIp"))
                .destinationFirstFrom(Integer.valueOf(rowData.get("DestinationFirstFrom")))
                .destinationFirstTo(Integer.valueOf(rowData.get("DestinationFirstTo")))
                .destinationSecondFrom(Integer.valueOf(rowData.get("DestinationSecondFrom")))
                .destinationSecondTo(Integer.valueOf(rowData.get("DestinationSecondTo")))
                .metric(rowData.get("Metric"))
                .threshold(Integer.valueOf(rowData.get("Threshold")))
                .build();
    }

    public SteeringSdwanParams buildSteeringApplication(DataTable datatable) {
        List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
        Map<String, String> rowData = data.get(0);
        return SteeringSdwanParams.builder()
                .saveChangesDescription(rowData.get("DescriptionSaveRule"))
                .name(rowData.get("Name"))
                .ruleDescription(rowData.get("RuleDescription"))
                .vpn(rowData.get("Vpn"))
                .rule_type(rowData.get("RuleType"))
                .application(Collections.singletonList(rowData.get("Application")))
                .protocol(rowData.get("Protocol"))
                .behaviour(rowData.get("Behavior"))
                .evaluate_continuously(Boolean.valueOf(rowData.get("EvaluateContinuously")))
                .editable(Boolean.valueOf(rowData.get("Editable")))
                .priority(Integer.valueOf(rowData.get("Priority")))
                .sourceFirstIp(rowData.get("SourceFirstIp"))
                .sourceSecondIp(rowData.get("SourceSecondIp"))
                .sourceFirstFrom(Integer.valueOf(rowData.get("SourceFirstFrom")))
                .sourceFirstTo(Integer.valueOf(rowData.get("SourceFirstTo")))
                .sourceSecondFrom(Integer.valueOf(rowData.get("SourceSecondFrom")))
                .sourceSecondTo(Integer.valueOf(rowData.get("SourceSecondTo")))
                .destinationFirstIp(rowData.get("DestinationFirstIp"))
                .destinationSecondIp(rowData.get("DestinationSecondIp"))
                .destinationFirstFrom(Integer.valueOf(rowData.get("DestinationFirstFrom")))
                .destinationFirstTo(Integer.valueOf(rowData.get("DestinationFirstTo")))
                .destinationSecondFrom(Integer.valueOf(rowData.get("DestinationSecondFrom")))
                .destinationSecondTo(Integer.valueOf(rowData.get("DestinationSecondTo")))
                .metric(rowData.get("Metric"))
                .threshold(Integer.valueOf(rowData.get("Threshold")))
                .build();
    }

    public SteeringSdwanParams buildSteeringSamePriority(DataTable datatable) {
        List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
        Map<String, String> rowData = data.get(0);
        return SteeringSdwanParams.builder()
                .saveChangesDescription(rowData.get("DescriptionSaveRule"))
                .name(rowData.get("Name"))
                .ruleDescription(rowData.get("RuleDescription"))
                .vpn(rowData.get("Vpn"))
                .rule_type(rowData.get("RuleType"))
                .application(Collections.singletonList(rowData.get("Application")))
                .protocol(rowData.get("Protocol"))
                .behaviour(rowData.get("Behavior"))
                .evaluate_continuously(Boolean.valueOf(rowData.get("EvaluateContinuously")))
                .editable(Boolean.valueOf(rowData.get("Editable")))
                .priority(Integer.valueOf(rowData.get("Priority")))
                .firstPriorityCircuitValue(Integer.valueOf(rowData.get("FirstPriorityCircuitValue")))
                .firstPriorityCircuitName(rowData.get("FirstPriorityCircuitName"))
                .secondPriorityCircuitValue(Integer.valueOf(rowData.get("SecondPriorityCircuitValue")))
                .secondPriorityCircuitName(rowData.get("SecondPriorityCircuitName"))
                .sourceFirstIp(rowData.get("SourceFirstIp"))
                .sourceSecondIp(rowData.get("SourceSecondIp"))
                .sourceFirstFrom(Integer.valueOf(rowData.get("SourceFirstFrom")))
                .sourceFirstTo(Integer.valueOf(rowData.get("SourceFirstTo")))
                .sourceSecondFrom(Integer.valueOf(rowData.get("SourceSecondFrom")))
                .sourceSecondTo(Integer.valueOf(rowData.get("SourceSecondTo")))
                .destinationFirstIp(rowData.get("DestinationFirstIp"))
                .destinationSecondIp(rowData.get("DestinationSecondIp"))
                .destinationFirstFrom(Integer.valueOf(rowData.get("DestinationFirstFrom")))
                .destinationFirstTo(Integer.valueOf(rowData.get("DestinationFirstTo")))
                .destinationSecondFrom(Integer.valueOf(rowData.get("DestinationSecondFrom")))
                .destinationSecondTo(Integer.valueOf(rowData.get("DestinationSecondTo")))
                .metric(rowData.get("Metric"))
                .threshold(Integer.valueOf(rowData.get("Threshold")))
                .build();
    }

    public SteeringSdwanParams buildSteeringOnePriorityOneAvoid(DataTable datatable) {
        List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
        Map<String, String> rowData = data.get(0);
        return SteeringSdwanParams.builder()
                .saveChangesDescription(rowData.get("DescriptionSaveRule"))
                .name(rowData.get("Name"))
                .ruleDescription(rowData.get("RuleDescription"))
                .vpn(rowData.get("Vpn"))
                .rule_type(rowData.get("RuleType"))
                .application(Collections.singletonList(rowData.get("Application")))
                .protocol(rowData.get("Protocol"))
                .behaviour(rowData.get("Behavior"))
                .evaluate_continuously(Boolean.valueOf(rowData.get("EvaluateContinuously")))
                .editable(Boolean.valueOf(rowData.get("Editable")))
                .priority(Integer.valueOf(rowData.get("Priority")))
                .firstAvoidCircuit(rowData.get("FirstAvoidCircuit"))
                .firstPriorityCircuitValue(Integer.valueOf(rowData.get("FirstPriorityCircuitValue")))
                .firstPriorityCircuitName(rowData.get("FirstPriorityCircuitName"))
                .sourceFirstIp(rowData.get("SourceFirstIp"))
                .sourceSecondIp(rowData.get("SourceSecondIp"))
                .sourceFirstFrom(Integer.valueOf(rowData.get("SourceFirstFrom")))
                .sourceFirstTo(Integer.valueOf(rowData.get("SourceFirstTo")))
                .sourceSecondFrom(Integer.valueOf(rowData.get("SourceSecondFrom")))
                .sourceSecondTo(Integer.valueOf(rowData.get("SourceSecondTo")))
                .destinationFirstIp(rowData.get("DestinationFirstIp"))
                .destinationSecondIp(rowData.get("DestinationSecondIp"))
                .destinationFirstFrom(Integer.valueOf(rowData.get("DestinationFirstFrom")))
                .destinationFirstTo(Integer.valueOf(rowData.get("DestinationFirstTo")))
                .destinationSecondFrom(Integer.valueOf(rowData.get("DestinationSecondFrom")))
                .destinationSecondTo(Integer.valueOf(rowData.get("DestinationSecondTo")))
                .metric(rowData.get("Metric"))
                .threshold(Integer.valueOf(rowData.get("Threshold")))
                .build();
    }

    public SteeringSdwanParams buildSteeringTwoAvoid(DataTable datatable) {
        List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
        Map<String, String> rowData = data.get(0);
        return SteeringSdwanParams.builder()
                .saveChangesDescription(rowData.get("DescriptionSaveRule"))
                .name(rowData.get("Name"))
                .ruleDescription(rowData.get("RuleDescription"))
                .vpn(rowData.get("Vpn"))
                .rule_type(rowData.get("RuleType"))
                .application(Collections.singletonList(rowData.get("Application")))
                .protocol(rowData.get("Protocol"))
                .behaviour(rowData.get("Behavior"))
                .evaluate_continuously(Boolean.valueOf(rowData.get("EvaluateContinuously")))
                .editable(Boolean.valueOf(rowData.get("Editable")))
                .priority(Integer.valueOf(rowData.get("Priority")))
                .firstAvoidCircuit(rowData.get("FirstAvoidCircuit"))
                .secondAvoidCircuit(rowData.get("SecondAvoidCircuit"))
                .sourceFirstIp(rowData.get("SourceFirstIp"))
                .sourceSecondIp(rowData.get("SourceSecondIp"))
                .sourceFirstFrom(Integer.valueOf(rowData.get("SourceFirstFrom")))
                .sourceFirstTo(Integer.valueOf(rowData.get("SourceFirstTo")))
                .sourceSecondFrom(Integer.valueOf(rowData.get("SourceSecondFrom")))
                .sourceSecondTo(Integer.valueOf(rowData.get("SourceSecondTo")))
                .destinationFirstIp(rowData.get("DestinationFirstIp"))
                .destinationSecondIp(rowData.get("DestinationSecondIp"))
                .destinationFirstFrom(Integer.valueOf(rowData.get("DestinationFirstFrom")))
                .destinationFirstTo(Integer.valueOf(rowData.get("DestinationFirstTo")))
                .destinationSecondFrom(Integer.valueOf(rowData.get("DestinationSecondFrom")))
                .destinationSecondTo(Integer.valueOf(rowData.get("DestinationSecondTo")))
                .metric(rowData.get("Metric"))
                .threshold(Integer.valueOf(rowData.get("Threshold")))
                .build();
    }

    public SteeringSdwanParams buildSteeringEmptyName(DataTable datatable) {
        List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
        Map<String, String> rowData = data.get(0);
        return SteeringSdwanParams.builder()
                .saveChangesDescription(rowData.get("DescriptionSaveRule"))
                .name(Optional.ofNullable(rowData.get("Name")).orElse(""))
                .ruleDescription(rowData.get("RuleDescription"))
                .vpn(rowData.get("Vpn"))
                .rule_type(rowData.get("RuleType"))
                .application(Collections.singletonList(rowData.get("Application")))
                .protocol(rowData.get("Protocol"))
                .behaviour(rowData.get("Behavior"))
                .evaluate_continuously(Boolean.valueOf(rowData.get("EvaluateContinuously")))
                .editable(Boolean.valueOf(rowData.get("Editable")))
                .priority(Integer.valueOf(rowData.get("Priority")))
                .firstPriorityCircuitValue(Integer.valueOf(rowData.get("FirstPriorityCircuitValue")))
                .firstPriorityCircuitName(rowData.get("FirstPriorityCircuitName"))
                .secondPriorityCircuitValue(Integer.valueOf(rowData.get("SecondPriorityCircuitValue")))
                .secondPriorityCircuitName(rowData.get("SecondPriorityCircuitName"))
                .sourceFirstIp(rowData.get("SourceFirstIp"))
                .sourceSecondIp(rowData.get("SourceSecondIp"))
                .sourceFirstFrom(Integer.valueOf(rowData.get("SourceFirstFrom")))
                .sourceFirstTo(Integer.valueOf(rowData.get("SourceFirstTo")))
                .sourceSecondFrom(Integer.valueOf(rowData.get("SourceSecondFrom")))
                .sourceSecondTo(Integer.valueOf(rowData.get("SourceSecondTo")))
                .destinationFirstIp(rowData.get("DestinationFirstIp"))
                .destinationSecondIp(rowData.get("DestinationSecondIp"))
                .destinationFirstFrom(Integer.valueOf(rowData.get("DestinationFirstFrom")))
                .destinationFirstTo(Integer.valueOf(rowData.get("DestinationFirstTo")))
                .destinationSecondFrom(Integer.valueOf(rowData.get("DestinationSecondFrom")))
                .destinationSecondTo(Integer.valueOf(rowData.get("DestinationSecondTo")))
                .metric(rowData.get("Metric"))
                .threshold(Integer.valueOf(rowData.get("Threshold")))
                .build();
    }

    public SteeringSdwanParams buildSteeringEmptyPacketLoss(DataTable datatable) {
        List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
        Map<String, String> rowData = data.get(0);
        return SteeringSdwanParams.builder()
                .saveChangesDescription(rowData.get("DescriptionSaveRule"))
                .name(Optional.ofNullable(rowData.get("Name")).orElse(""))
                .ruleDescription(rowData.get("RuleDescription"))
                .vpn(rowData.get("Vpn"))
                .rule_type(rowData.get("RuleType"))
                .application(Collections.singletonList(rowData.get("Application")))
                .protocol(rowData.get("Protocol"))
                .behaviour(rowData.get("Behavior"))
                .evaluate_continuously(Boolean.valueOf(rowData.get("EvaluateContinuously")))
                .editable(Boolean.valueOf(rowData.get("Editable")))
                .priority(Integer.valueOf(rowData.get("Priority")))
                .firstPriorityCircuitValue(Integer.valueOf(rowData.get("FirstPriorityCircuitValue")))
                .firstPriorityCircuitName(rowData.get("FirstPriorityCircuitName"))
                .secondPriorityCircuitValue(Integer.valueOf(rowData.get("SecondPriorityCircuitValue")))
                .secondPriorityCircuitName(rowData.get("SecondPriorityCircuitName"))
                .sourceFirstIp(rowData.get("SourceFirstIp"))
                .sourceSecondIp(rowData.get("SourceSecondIp"))
                .sourceFirstFrom(Integer.valueOf(rowData.get("SourceFirstFrom")))
                .sourceFirstTo(Integer.valueOf(rowData.get("SourceFirstTo")))
                .sourceSecondFrom(Integer.valueOf(rowData.get("SourceSecondFrom")))
                .sourceSecondTo(Integer.valueOf(rowData.get("SourceSecondTo")))
                .destinationFirstIp(rowData.get("DestinationFirstIp"))
                .destinationSecondIp(rowData.get("DestinationSecondIp"))
                .destinationFirstFrom(Integer.valueOf(rowData.get("DestinationFirstFrom")))
                .destinationFirstTo(Integer.valueOf(rowData.get("DestinationFirstTo")))
                .destinationSecondFrom(Integer.valueOf(rowData.get("DestinationSecondFrom")))
                .destinationSecondTo(Integer.valueOf(rowData.get("DestinationSecondTo")))
                .metric(rowData.get("Metric"))
                .threshold(null)
                .build();
    }

    public SteeringInternetParams buildSteeringInternet(DataTable datatable) {
            List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
            Map<String, String> rowData = data.get(0);
            return SteeringInternetParams.builder()
                    .priority(Integer.valueOf(rowData.get("Priority")))
                    .name(rowData.get("Name"))
                    .ruleDescription(rowData.get("RuleDescription"))
                    .application(rowData.get("FirstApplication"))
                    .application(rowData.get("SecondApplication"))
                    .rule_type(rowData.get("RuleType"))
                    .vpn(rowData.get("Vpn"))
                    .breakout_type(rowData.get("BreakoutType"))
                    .breakoutTypePriority(Integer.valueOf(rowData.get("BreakoutTypePriority")))
                    .local_interface(rowData.get("LocalInterface"))
                .build();
    }

    public SteeringInternetParams buildSteeringInternetEmptyName(DataTable datatable) {
        List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
        Map<String, String> rowData = data.get(0);
        return SteeringInternetParams.builder()
                .priority(Integer.valueOf(rowData.get("Priority")))
                .name(Optional.ofNullable(rowData.get("Name")).orElse(""))
                .ruleDescription(rowData.get("RuleDescription"))
                .application(rowData.get("FirstApplication"))
                .application(rowData.get("SecondApplication"))
                .rule_type(rowData.get("RuleType"))
                .vpn(rowData.get("Vpn"))
                .breakout_type(rowData.get("BreakoutType"))
                .breakoutTypePriority(Integer.valueOf(rowData.get("BreakoutTypePriority")))
                .local_interface(rowData.get("LocalInterface"))
                .build();
    }

    public SteeringSaasParams buildSteeringSaas(DataTable datatable) {
        List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
        Map<String, String> rowData = data.get(0);
        return SteeringSaasParams.builder()
                .priority(Integer.valueOf(rowData.get("Priority")))
                .max_latency(Integer.valueOf(rowData.get("MaxLatency")))
                .max_packet_loss(Integer.valueOf(rowData.get("MaxPacketLoss")))
                .network(rowData.get("Network"))
                .saas_application(rowData.get("SaasApplication"))
                .saas_application_fqdn(rowData.get("SaasApplicationFqdn"))
                .breakout_type(rowData.get("BreakoutType"))
                .slaNextHopsPriority(Integer.valueOf(rowData.get("SlaNextHopsPriority")))
                .local_interface(rowData.get("LocalInterface"))
                .build();
    }

    public SteeringSaasParams buildSteeringSaasPacketLoss(DataTable datatable) {
        List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
        Map<String, String> rowData = data.get(0);
        return SteeringSaasParams.builder()
                .priority(Integer.valueOf(rowData.get("Priority")))
                .max_latency(Integer.valueOf(rowData.get("MaxLatency")))
                .max_packet_loss(null)
                .network(rowData.get("Network"))
                .saas_application(rowData.get("SaasApplication"))
                .saas_application_fqdn(rowData.get("SaasApplicationFqdn"))
                .breakout_type(rowData.get("BreakoutType"))
                .slaNextHopsPriority(Integer.valueOf(rowData.get("SlaNextHopsPriority")))
                .local_interface(rowData.get("LocalInterface"))
                .build();
    }

    public SteeringSaasParams buildSteeringSaasMaxLatency(DataTable datatable) {
        List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
        Map<String, String> rowData = data.get(0);
        return SteeringSaasParams.builder()
                .priority(Integer.valueOf(rowData.get("Priority")))
                .max_latency(null)
                .max_packet_loss(Integer.valueOf(rowData.get("MaxPacketLoss")))
                .network(rowData.get("Network"))
                .saas_application(rowData.get("SaasApplication"))
                .saas_application_fqdn(rowData.get("SaasApplicationFqdn"))
                .breakout_type(rowData.get("BreakoutType"))
                .slaNextHopsPriority(Integer.valueOf(rowData.get("SlaNextHopsPriority")))
                .local_interface(rowData.get("LocalInterface"))
                .build();
    }

    public SteeringSaasParams buildSteeringSaasApplication(DataTable datatable) {
        List<Map<String, String>> data = datatable.asMaps(String.class, String.class);
        Map<String, String> rowData = data.get(0);
        return SteeringSaasParams.builder()
                .priority(Integer.valueOf(rowData.get("Priority")))
                .max_latency(Integer.valueOf(rowData.get("MaxLatency")))
                .max_packet_loss(Integer.valueOf(rowData.get("MaxPacketLoss")))
                .network(rowData.get("Network"))
                .saas_application(null)
                .saas_application_fqdn(null)
                .breakout_type(rowData.get("BreakoutType"))
                .slaNextHopsPriority(Integer.valueOf(rowData.get("SlaNextHopsPriority")))
                .local_interface(rowData.get("LocalInterface"))
                .build();
    }


}
