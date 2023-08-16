package communication.request.steering.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SteeringMetrics {
    @JsonProperty("metric")
    private String metric;

    @JsonProperty("threshold")
    private Integer threshold;
}
