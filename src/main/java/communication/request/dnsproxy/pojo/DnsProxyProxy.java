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
public class DnsProxyProxy {
    @JsonProperty("proxies")
    private List<DnsProxyProxyRule> dnsProxyProxiesObjects;

    @JsonProperty("description")
    private String description;

}
