package stepDefinitions;

import io.cucumber.java.en.And;
import utils.TestContext;

public class DefinitionsOfSdWanNetwork extends AnnotationForDefinitions{
    public DefinitionsOfSdWanNetwork(TestContext context) {
        super(context);
    }

    @And("I lock {string} the Site")
    public void iLockTheSite(String lockTrue) {
        implementationOfSdWanNetwork.getLockOfSite(lockTrue);
    }

    @And("I wait until the site is has finish the commit changes")
    public void iWaitUntilTheSiteIsHasFinishTheCommitChanges() {
        implementationOfSdWanNetwork.getWaitCondition();
    }
}
