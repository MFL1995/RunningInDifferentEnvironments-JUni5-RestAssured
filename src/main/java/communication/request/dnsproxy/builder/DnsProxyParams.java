package communication.request.dnsproxy.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DnsProxyParams {
    String description;
    String proxyName;
    String proxyVpn;
    String proxyMode;
    String proxyQueryPatterns;
    String dnsName;
    String dnsIp;
    String dnsDomain;
    String dnsMonitor;
}
