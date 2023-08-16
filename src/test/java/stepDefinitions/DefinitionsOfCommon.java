package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utils.TestContext;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class DefinitionsOfCommon extends AnnotationForDefinitions{
    public DefinitionsOfCommon(TestContext context) {
        super(context);
    }

    @Then("I retrieve the SoftAssertions")
    public void iRetrieveTheSoftAssertions() {
        implementationOfCommon.getSoftAssertionsResponse();
    }

    @Then("I verify the response code is {int}")
    public void IVerifyTheResponseCodeIs(Integer statusCode) {
        implementationOfCommon.getVerifyResponseCodeStatus(statusCode);
    }

    @Then("I verify the Response of status attribute {string}")
    public void iVerifyTheStatusCodeIs(String statusCode) {
        implementationOfCommon.getVerifyResponseOfStatusProperty(statusCode);
    }

    @And("I verify the Response of detail attribute {string}")
    public void iVerifyTheResponseOfDetailAttribute(String detail) {
        implementationOfCommon.getVerifyResponseOfDetailProperty(detail);
    }

    @And("I verify the Response of title attribute {string}")
    public void iVerifyTheResponseOfTitleAttribute(String title) {
        implementationOfCommon.getVerifyResponseOfTitleProperty(title);
    }

    @And("I verify the Response of error attribute {string}")
    public void iVerifyTheResponseOfErrorAttribute(String error) {
        implementationOfCommon.getVerifyResponseOfErrorProperty(error);
    }

    @Then("I create PUT request to delete Steering Rule")
    public void iCreatePUTRequestToDeleteSteeringRule() {
        implementationOfCommon.getDeleteSteeringRule();
    }

    @Then("I create PUT request to delete the DnsProxy rule")
    public void iCreatePUTRequestToDeleteTheDnsProxyRule() {
        implementationOfCommon.getDeleteDnsProxyRule("delete DnsProxy Rule Description", new ArrayList<>());
    }

}
