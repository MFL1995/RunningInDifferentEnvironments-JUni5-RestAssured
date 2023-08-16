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
public class SteeringSaasRule {
    @JsonProperty("priority")
    private Integer priority;

    @JsonProperty("max_latency")
    private Integer max_latency;

    @JsonProperty("max_packet_loss")
    private Integer max_packet_loss;

    @JsonProperty("network")
    private String network;

    @JsonProperty("saas_application")
    private String saas_application;

    @JsonProperty("saas_application_fqdn")
    private String saas_application_fqdn;

    @JsonProperty("sla_next_hops")
    private List<SlaNextHops> sla_next_hops;

    @JsonProperty("isContentVisible")
    private Boolean isContentVisible;

}
