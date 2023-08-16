package communication.response.ErrorCodes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Violations {
    @JsonProperty("field")
    private String field;

    @JsonProperty("message")
    private String message;

}
