package communication.request.steering.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SteeringSaasParams {
    Integer priority;
    Integer max_latency;
    Integer max_packet_loss;
    String network;
    String saas_application;
    String saas_application_fqdn;
    String breakout_type;
    Integer slaNextHopsPriority;
    String local_interface;
}
