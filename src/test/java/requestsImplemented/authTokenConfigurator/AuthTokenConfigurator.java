package requestsImplemented.authTokenConfigurator;

import utils.TestContext;

public class AuthTokenConfigurator {
    private final TestContext context;
    public AuthTokenConfigurator(TestContext context) {
        this.context = context;
    }

    public String configureAuthTokenHeader() {
        String authToken = context.getSessionAttribute("token").toString();
        context.requestSetup().header("X-Auth-Token", authToken);
        return authToken;
    }
}
