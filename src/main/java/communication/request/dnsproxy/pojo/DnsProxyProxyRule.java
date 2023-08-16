package communication.request.dnsproxy.pojo;

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
public class DnsProxyProxyRule {
    @JsonProperty("dns")
    private List<DnsProxyDns> dnsProxyDnsObjects;

    @JsonProperty("name")
    private String name;

    @JsonProperty("vpn")
    private String vpn;

    @JsonProperty("mode")
    private String mode;

    @JsonProperty("query_patterns")
    private List<String> query_patterns;

}
