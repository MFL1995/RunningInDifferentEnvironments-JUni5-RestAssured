package runner;

import io.cucumber.java.BeforeAll;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.platform.suite.api.*;
import utils.SharedData;

import java.util.stream.Stream;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
//@SelectClasspathResource("features")
@SelectFiles({
//        @SelectFile("src/test/resources/features/Steering.feature"),
        @SelectFile("src/test/resources/features/DnsProxy.feature"),

})
@IncludeTags("happyflow")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepDefinitions")
public class Test {
    @BeforeAll
    public static void setup() {
        // Set the default parser to JSON
        RestAssured.defaultParser = Parser.JSON;
    }


}


/*
        Currently 11 features automated:
                @SelectFile("src/test/resources/features/security/securityProfiles/Antivirus.feature"),
                @SelectFile("src/test/resources/features/security/DDOS.feature"),
                @SelectFile("src/test/resources/features/security/Decryption.feature"),
                @SelectFile("src/test/resources/features/policy/DnsProxy.feature"),
                @SelectFile("src/test/resources/features/security/Firewall.feature"),
                @SelectFile("src/test/resources/features/security/NAT.feature"),
                @SelectFile("src/test/resources/features/siteSettings/Netflow.feature"),
                @SelectFile("src/test/resources/features/policy/QoS.feature"),
                @SelectFile("src/test/resources/features/security/SecureLogForwarding.feature"),
                @SelectFile("src/test/resources/features/siteSettings/SNMP.feature"),
                @SelectFile("src/test/resources/features/security/securityProfiles/UrlFiltering.feature"),
                @SelectFile("src/test/resources/features/policy/Steering.feature"),

        Missing:
                @SelectFile("src/test/resources/features/security/securityProfiles/IpsVulnerability.feature"),
                @SelectFile("src/test/resources/features/security/securityProfiles/IpFiltering.feature"),
                @SelectFile("src/test/resources/features/sase/Profiles.feature.feature"),
                @SelectFile("src/test/resources/features/sase/UsersAndGroups.feature"),
*/