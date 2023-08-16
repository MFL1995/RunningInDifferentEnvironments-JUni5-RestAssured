package stepDefinitions;

import communication.request.dnsproxy.builder.DnsProxyParams;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import utils.TestContext;

public class DefinitionsOfDnsProxy extends AnnotationForDefinitions{
    public DefinitionsOfDnsProxy(TestContext context) {
        super(context);
    }
    @And("I create PUT request for DnsProxy Rule")
    public void iCreatePUTRequestForDnsProxyRule(DataTable dataTable) {
        DnsProxyParams dnsProxyParams = dnsProxyBuildParams.buildDnsProxy(dataTable);
        implementationOfDnsProxy.getPutRequest(dnsProxyParams);
    }
    @And("I create PUT request for DnsProxy Rule without authentication")
    public void iCreatePUTRequestForDnsProxyRuleWithoutAuthentication(DataTable dataTable) {
        DnsProxyParams dnsProxyParams = dnsProxyBuildParams.buildDnsProxy(dataTable);
        implementationOfDnsProxy.getPutRequest(dnsProxyParams);
    }
}
