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
public class SteeringInternetRules {
    @JsonProperty("name")
    private String name;

    @JsonProperty("priority")
    private Integer priority;

    @JsonProperty("description")
    private String description;

    @JsonProperty("application")
    private List<String> application;

    @JsonProperty("rule_type")
    private String rule_type;

    @JsonProperty("vpn")
    private String vpn;

    @JsonProperty("breakout_priorities")
    private List<SteeringBreakoutPriorities> breakout_priorities;

    @JsonProperty("isContentVisible")
    private Boolean isContentVisible;

}
