package communication.request.steering.builder;

import lombok.Builder;
import lombok.Data;
import java.util.List;

@Data
@Builder
public class SteeringInternetParams {
    Integer priority;
    String name;
    String ruleDescription;
    String application;
    String rule_type;
    String vpn;
    String breakout_type;
    Integer breakoutTypePriority;
    String local_interface;
}
