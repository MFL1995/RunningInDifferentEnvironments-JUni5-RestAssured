package communication.request.login.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginJson {
    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

}
