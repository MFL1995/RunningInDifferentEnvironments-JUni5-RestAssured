package communication.request.dnsproxy.builder;


import communication.request.dnsproxy.pojo.DnsProxyDeleteRule;
import communication.request.dnsproxy.pojo.DnsProxyDns;
import communication.request.dnsproxy.pojo.DnsProxyProxy;
import communication.request.dnsproxy.pojo.DnsProxyProxyRule;

import java.util.ArrayList;
import java.util.Collections;

public class DnsProxyBuilder {
    public static DnsProxyProxy dnsProxyBuilderRule(DnsProxyParams params) {
        return DnsProxyProxy.builder()
                .description(params.description)
                .dnsProxyProxiesObjects(Collections.singletonList(DnsProxyProxyRule.builder()
                        .dnsProxyDnsObjects(Collections.singletonList(DnsProxyDns.builder()
                                .name(params.dnsName)
                                .ip(params.dnsIp)
                                .domain_name(params.dnsDomain)
                                .monitor(params.dnsMonitor)
                                .build()))
                        .name(params.proxyName)
                        .vpn(params.proxyVpn)
                        .mode(params.proxyMode)
                        .query_patterns(Collections.singletonList(params.proxyQueryPatterns))
                        .build()))
                .build();
    }

    public static DnsProxyDeleteRule dnsProxyDeleteBuilderRule(String description, ArrayList<String> proxies) {
        return DnsProxyDeleteRule.builder()
                .description(description)
                .proxies(proxies)
                .build();
    }
}
