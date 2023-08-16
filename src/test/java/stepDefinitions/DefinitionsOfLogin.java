package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utils.TestContext;

public class DefinitionsOfLogin extends AnnotationForDefinitions{
    public DefinitionsOfLogin(TestContext context) {
        super(context);
    }
    @Given("I save the {string} EndPoint")
    public void iSaveTheEndPoint(String saveEndPoint) {
        implementationOfLogin.selectEndPoint(saveEndPoint);
    }

    @And("I save during the session the login response")
    public void IStoreDuringTheSessionTheLoginResponse() {
        implementationOfLogin.getCreationOfAuthentication();
    }

    @And("I create Patch request with a different user")
    public void iCreatePatchRequestWithADifferentUser() {
        implementationOfLogin.getSecondAuthentication();
    }
}
