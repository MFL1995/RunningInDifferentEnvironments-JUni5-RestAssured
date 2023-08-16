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
public class SteeringDestination {
    @JsonProperty("ip")
    private List<String> ip;
    @JsonProperty("port")
    private List<SteeringDestinationPort> port;

}
