package communication.request.steering.builder;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class SteeringSdwanParams {
    String saveChangesDescription;
    String name;
    String ruleDescription;
    String vpn;
    String rule_type;
    List<String> application;
    String protocol;
    String behaviour;
    Boolean evaluate_continuously;
    Boolean editable;
    Integer priority;
    String firstAvoidCircuit;
    String secondAvoidCircuit;
    List<String> circuitPriorityList;
    Integer firstPriorityCircuitValue;
    String firstPriorityCircuitName;
    Integer secondPriorityCircuitValue;
    String secondPriorityCircuitName;
    String sourceFirstIp;
    String sourceSecondIp;
    Integer sourceFirstFrom;
    Integer sourceFirstTo;
    Integer sourceSecondFrom;
    Integer sourceSecondTo;
    String destinationFirstIp;
    String destinationSecondIp;
    Integer destinationFirstFrom;
    Integer destinationFirstTo;
    Integer destinationSecondFrom;
    Integer destinationSecondTo;
    String metric;
    Integer threshold;
}
