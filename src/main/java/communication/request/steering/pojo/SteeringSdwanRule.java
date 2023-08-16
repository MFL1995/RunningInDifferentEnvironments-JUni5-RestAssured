package communication.request.steering.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SteeringSdwanRule {
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("vpn")
    private String vpn;

    @JsonProperty("rule_type")
    private String rule_type;

    @JsonProperty("application")
    private List<String> application;

    @JsonProperty("protocol")
    private String protocol;

    @JsonProperty("behaviour")
    private String behaviour;

    @JsonProperty("evaluate_continuously")
    private Boolean evaluate_continuously;

    @JsonProperty("editable")
    private Boolean editable;

    @JsonProperty("priority")
    private Integer priority;

    @JsonProperty("avoid_circuit")
    private List<String> avoid_circuit;

    @JsonProperty("circuit_priority")
    private List<SteeringPriorityCircuit> circuitPriority;

    @JsonProperty("source")
    private SteeringSource source;

    @JsonProperty("destination")
    private SteeringDestination destination;

    @JsonProperty("metrics")
    private List<SteeringMetrics> metrics;

    @JsonProperty("next_hop_details")
    private String next_hop_details;

    @JsonProperty("best_path_selection")
    private SteeringBestPathSelection best_path_selection;

    @JsonProperty("isContentVisible")
    private Boolean isContentVisible;

    @JsonProperty("zone")
    private String zone;
}
