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
public class SteeringBestPathSelection {
    @JsonProperty("lowest_latency")
    private Boolean lowest_latency;

    @JsonProperty("lowest_packet_loss")
    private Boolean lowest_packet_loss;

    @JsonProperty("lowest_jitter")
    private Boolean lowest_jitter;
}
