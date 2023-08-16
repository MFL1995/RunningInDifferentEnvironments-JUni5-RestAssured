package communication.request.steering.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SteeringBreakoutPriorities {
    @JsonProperty("breakout_type")
    private String breakout_type;

    @JsonProperty("priority")
    private Integer priority;

    @JsonProperty("local_interface")
    private String local_interface;

    @JsonProperty("remote_gateway")
    private String remote_gateway;

}
