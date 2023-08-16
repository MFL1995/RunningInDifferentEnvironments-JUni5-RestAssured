package communication.request.dnsproxy.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DnsProxyDns {
    @JsonProperty("name")
    private String name;

    @JsonProperty("ip")
    private String ip;

    @JsonProperty("domain_name")
    private String domain_name;

    @JsonProperty("monitor")
    private String monitor;

}
