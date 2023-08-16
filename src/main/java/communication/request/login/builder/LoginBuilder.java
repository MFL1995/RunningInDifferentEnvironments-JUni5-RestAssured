package communication.request.login.builder;

import communication.request.login.pojo.LoginJson;

public class LoginBuilder {
    public static LoginJson requestPostForAccountList(String username, String password) {
        return LoginJson.builder()
                .username(username)
                .password(password)
                .build();
    }
}
