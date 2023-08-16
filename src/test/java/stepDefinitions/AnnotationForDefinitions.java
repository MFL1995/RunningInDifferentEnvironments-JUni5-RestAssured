package stepDefinitions;

import requestsImplemented.*;
import requestsImplemented.dnsProxy.ImplementationOfDnsProxy;
import requestsImplemented.steering.ImplementationOfSteering;
import stepDefinitions.buildParams.DnsProxyBuildParams;
import stepDefinitions.buildParams.SteeringBuildParams;
import utils.TestContext;

import java.util.List;
import java.util.Map;

public class AnnotationForDefinitions {
    private final TestContext context;

    public AnnotationForDefinitions(TestContext context) {
        this.context = context;
        implementationOfSdWanNetwork = new ImplementationOfSdWanNetwork(context);
        implementationOfLogin = new ImplementationOfLogin(context);
        implementationOfCommon = new ImplementationOfCommon(context);
        implementationOfSteering = new ImplementationOfSteering(context);
        implementationOfDnsProxy = new ImplementationOfDnsProxy(context);


//      buildParams package
        steeringBuildParams = new SteeringBuildParams();
        dnsProxyBuildParams = new DnsProxyBuildParams();
    }
    List<Map<String, String>> getString;

    ImplementationOfSdWanNetwork implementationOfSdWanNetwork;
    ImplementationOfLogin implementationOfLogin;
    ImplementationOfCommon implementationOfCommon;
    ImplementationOfSteering implementationOfSteering;
    ImplementationOfDnsProxy implementationOfDnsProxy;


//  buildParams package
    SteeringBuildParams steeringBuildParams;
    DnsProxyBuildParams dnsProxyBuildParams;
}
