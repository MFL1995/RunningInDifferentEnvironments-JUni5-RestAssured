package communication.request.steering.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SteeringRuleSet {
    @JsonProperty("description")
    private String description;

    @JsonProperty("sdwan_rules")
    private List<SteeringSdwanRule> sdwan_rules;

    @JsonProperty("internet_rules")
    private List<SteeringInternetRules> internet_rules;

    @JsonProperty("saas_rules")
    private List<SteeringSaasRule> saas_rules;

}
