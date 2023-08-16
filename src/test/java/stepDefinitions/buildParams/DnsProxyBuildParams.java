package stepDefinitions.buildParams;

import communication.request.dnsproxy.builder.DnsProxyParams;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class DnsProxyBuildParams {
    public DnsProxyParams buildDnsProxy(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        Map<String, String> rowData = data.get(0);
return DnsProxyParams.builder()
        .description(rowData.get("Description"))
        .proxyName(rowData.get("ProxyName"))
        .proxyVpn(rowData.get("ProxyVpn"))
        .proxyMode(rowData.get("ProxyMode"))
        .proxyQueryPatterns(rowData.get("ProxyQueryPattern"))
        .dnsName(rowData.get("DnsName"))
        .dnsIp(rowData.get("DnsIp"))
        .dnsDomain(rowData.get("DnsDomain"))
        .dnsMonitor(rowData.get("DnsMonitor"))
        .build();
    }
}
